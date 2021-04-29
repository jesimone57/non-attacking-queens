import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jsimone on 12/14/15.
 * <p>
 * solution is here:    https://en.wikipedia.org/wiki/Eight_queens_puzzle
 * <p>
 * This is how the wiki page solutions map to the output of this code:
 * <p>
 * wiki solution 1 = 13572064 -> solution 4
 * wiki solution 2 = 06357142 -> solution 6
 * wiki solution 3 = 06471352 -> solution 1
 * wiki solution 4 = 30471625 -> solution 12
 * wiki solution 5 = 40731625 -> solution 10
 * wiki solution 6 = 20647135 -> solution 11
 * wiki solution 7 = 40357162 -> solution 3
 * wiki solution 8 = 60275314 -> solution 7
 * wiki solution 9 = 40752613 -> solution 9
 * wiki solution 10 = 46031752 -> solution 5
 * wiki solution 11 = 52073164 -> solution 2
 * wiki solution 12 = 42061753 -> solution 8
 */
public class NonAttackingQueens {

	private static int boardSize = 8;

	public static void main(String[] args) {
		if (args.length == 1) {
			try {
				boardSize = Integer.parseInt(args[0]);
			} catch (NumberFormatException ex) {
				System.out.println("Usage is: java NonAttackingQueens n");
				System.out.println("Where n = board size.  n must be in the range of 1 through 10.  n is optional and if omitted defaults to 8");
				return;
			}
			if (boardSize < 1 || boardSize > 10) {
				System.out.println("board size "+ boardSize +" is not in the range of 1 through 10");
				return;
			}
		}

		List<String> results = new ArrayList<>();
		String ordinalEncoding = IntStream.range(0, boardSize).mapToObj(i -> ((Integer) i).toString()).collect(Collectors.joining(""));
		System.out.println("For a " + boardSize + " x " + boardSize + " board ...");
		System.out.println("Ordinal Encoding of Queen Positions: " + ordinalEncoding);
		permutation("", ordinalEncoding, results);

		System.out.println("There are " + results.size() + " solutions.\n");
		System.out.println("NOTES:  Using an index origin of 0 labels the leftmost file/column of the chess board as 0.  ");
		System.out.println("\tEach solution has its board labled on the left with the ordinal encoding.");
		System.out.println("\tSolutions encoded by the file/column ordinal of the Queen's position on the board:");
		System.out.println(results);


//        System.out.println(results.contains(reverse("04752613")));
//        List<String> uniqueResults = results.stream()
//                .filter(r -> ! results.contains(reverse(r)))
//                .collect(Collectors.toList());
//        System.out.println("There are " + uniqueResults.size() + " solutions.");


//        String solution = "04752613";
//        System.out.println(solution);
//        System.out.println(reverse(solution));
//        System.out.println(flip(solution));
//        System.out.println(reverse(flip(solution)));
//
//        System.out.println(rotate(solution));
//        System.out.println(reverse(rotate(solution)));
//        System.out.println(flip(rotate(solution)));
//        System.out.println(reverse(flip(rotate(solution))));

		Map<String, Set<String>> map = pruneResults(results, boardSize);
		System.out.println("\nThere are " + map.size() + " unique solutions " +
				"by taking into account all possible rotations and reflections/mirrors of the board.\n");
		Display.displaySolutions(map, boardSize);
	}

	private static void addVariationToSet(String variation, Set<String> variationSet, Set<String> resultsAlreadyAccountedFor) {
		if (!resultsAlreadyAccountedFor.contains(variation)) {
			if (!variationSet.contains(variation)) {
				variationSet.add(variation);
				resultsAlreadyAccountedFor.add(variation);
			}
		}
	}

	private static Map<String, Set<String>> pruneResults(List<String> results, int boardSize) {
		Map<String, Set<String>> pruned = new HashMap<>();
		Set<String> resultsAlreadyAccountedFor = new HashSet<>();
		for (String result : results) {
			if (!resultsAlreadyAccountedFor.contains(result)) {
				Set<String> variationSet = new TreeSet<>();

				// add all the variations for this particular result, if they have not already been accounted for
				addVariationToSet(result, variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(reverse(result), variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(flip(result, boardSize), variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(reverse(flip(result, boardSize)), variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(rotate(result, boardSize), variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(reverse(rotate(result, boardSize)), variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(flip(rotate(result, boardSize), boardSize), variationSet, resultsAlreadyAccountedFor);
				addVariationToSet(reverse(flip(rotate(result, boardSize), boardSize)), variationSet, resultsAlreadyAccountedFor);
				pruned.put(result, variationSet);
			}
		}
		return pruned;
	}

	private static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static String rotate(String s, int boardSize) {
		String[] result = new String[boardSize];
		int col = 0;
		for (Character c : s.toCharArray()) {
			int row = Character.getNumericValue(c);
			result[row] = Integer.toString(col);
            //System.out.println("result("+row+") = "+Integer.toString(col));
			col++;
		}
        //System.out.println(Arrays.toString(result).join("", result));
		return String.join("", result);
	}

	private static String flip(String s, int boardSize) {
		int maxOrdinal = boardSize - 1;
		StringBuilder stringBuilder = new StringBuilder();
		for (Character c : s.toCharArray()) {
			Integer i = Character.getNumericValue(c);
			stringBuilder.append(maxOrdinal - i);
		}
		return stringBuilder.toString();
	}

	public static boolean isNonAttackingOnDiagonal(String s) {
		boolean result = true;
		for (int i = 0; i < s.length(); i++) {
			String s2 = String.valueOf(s.charAt(i));
			int i2 = Integer.parseInt(s2);
			for (int j = 0; j < s.length(); j++) {
				String s3 = String.valueOf(s.charAt(j));
				int j3 = Integer.parseInt(s3);
				if (i != j) {
					if (Math.abs(i - j) == Math.abs(i2 - j3)) {
						result = false;
						break;
					}
				}
			}
			if (!result) {
				break;
			}
		}
		return result;
	}

	private static void permutation(String prefix, String str, List<String> results) {
		int n = str.length();
		if (n == 0) {
			if (isNonAttackingOnDiagonal(prefix)) {
				results.add(prefix);
			}
		} else {
			for (int i = 0; i < n; i++) {
				//System.out.println("going in with prefix="+prefix + str.charAt(i)+"     and list="+str.substring(0, i) + str.substring(i + 1, n));
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), results);
			}
		}
	}

	/**
	 * Permutes a list
	 *
	 * @param prefix starting prefix for recursion
	 * @param list   list
	 */
	public static void permutation(List<String> prefix, List<String> list, List<String> results) {
		int n = list.size();
		if (n == 0) {
			//System.out.println("->"+prefix);
			results.add(prefix.stream().reduce("", String::concat));
		} else {
			for (int i = 0; i < n; i++) {
				List<String> newList = new ArrayList<>();
				newList.addAll(list.subList(0, i));
				newList.addAll(list.subList(i + 1, n));

				List<String> prefixList = new ArrayList<>();
				prefixList.addAll(prefix);
				prefixList.add(list.get(i));
				//System.out.println("going in with prefix="+prefixList+"     and list="+newList);
				permutation(prefixList, newList, results);
			}
		}
	}
}

import java.util.Map;
import java.util.Set;

/**
 * Created by jsimone on 5/10/17.
 */
public class Display {
	private Display() {
	}

	public static void displayRow(int rowOrdinal, int boardSize) {
		StringBuilder sbCell = new StringBuilder();
		StringBuilder sbDivider = new StringBuilder();
		String[] args = new String[boardSize];
		for (int i = 0; i < boardSize; i++) {
			args[i] = (i == rowOrdinal ? "Q" : " ");
			sbCell.append("| %s ");
			sbDivider.append("|---");
		}
		sbCell.append("|\n");
		sbDivider.append("|");
		System.out.format(sbCell.toString(), (Object[]) args);
		System.out.println(sbDivider.toString());
	}

	public static void displayBoard(String s, int boardSize) {
		StringBuilder sbDivider = new StringBuilder();
		for (int i = 0; i < boardSize; i++) {
			sbDivider.append("|---");
		}
		sbDivider.append("|");
		System.out.println(sbDivider.toString());
		for (Character c : s.toCharArray()) {
			displayRow(Integer.valueOf(String.valueOf(c)), boardSize);
		}
		System.out.println("\n");
	}

	public static void displaySolutions(Map<String, Set<String>> solutions, int boardSize) {
		int i = 0;
		for (String key : solutions.keySet()) {
			System.out.println("Unique Solution " + (++i) + ":  " + key + "  All possible rotations and refliections/mirrors give: " + solutions.get(key));
			Display.displayBoard(key, boardSize);
		}
	}
}

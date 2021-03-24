import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

/**
 * Created by jsimone on 5/9/17.
 */
public class PermutationTest {

	@Test
	public void testPermutationTest1() {
		List<String> prefix = singletonList("");
		List<String> list = singletonList("A");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(singletonList("A"), results);
	}

	@Test
	public void testPermutationTest2() {
		List<String> prefix = singletonList("");
		List<String> list = asList("A", "B");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(asList("AB", "BA"), results);
	}

	@Test
	public void testPermutationTest3() {
		List<String> prefix = singletonList("");
		List<String> list = asList("A", "B", "C");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"), results);
	}

	@Test
	public void testPermutationTest4() {
		List<String> prefix = singletonList("");
		List<String> list = asList("A", "B", "C", "D");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(asList(
				"ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB",
				"BACD", "BADC", "BCAD", "BCDA", "BDAC", "BDCA",
				"CABD", "CADB", "CBAD", "CBDA", "CDAB", "CDBA",
				"DABC", "DACB", "DBAC", "DBCA", "DCAB", "DCBA"), results);
	}

	@Test
	public void testPermutationTest5() {
		List<String> prefix = singletonList("");
		List<String> list = asList("A", "B", "C", "D", "E");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
	}

	@Test
	public void testPermutationTest6() {
		List<String> prefix = singletonList("");
		List<String> list = asList("A", "B", "C", "D", "E", "F");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
	}

	public static int factorial(int f) {
		return ((f == 0) ? 1 : f * factorial(f - 1));
	}
}

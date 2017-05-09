import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jsimone on 5/9/17.
 */
public class PermutationTest {

	@Test
	public void testPermutationTest1() throws Exception {
		List<String> prefix = Arrays.asList("");
		List<String> list = Arrays.asList("A");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(Arrays.asList("A"), results);
	}

	@Test
	public void testPermutationTest2() throws Exception {
		List<String> prefix = Arrays.asList("");
		List<String> list = Arrays.asList("A", "B");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(Arrays.asList("AB", "BA"), results);
	}

	@Test
	public void testPermutationTest3() throws Exception {
		List<String> prefix = Arrays.asList("");
		List<String> list = Arrays.asList("A", "B", "C");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"), results);
	}

	@Test
	public void testPermutationTest4() throws Exception {
		List<String> prefix = Arrays.asList("");
		List<String> list = Arrays.asList("A", "B", "C", "D");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
		assertEquals(Arrays.asList(
				"ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB",
				"BACD", "BADC", "BCAD", "BCDA", "BDAC", "BDCA",
				"CABD", "CADB", "CBAD", "CBDA", "CDAB", "CDBA",
				"DABC", "DACB", "DBAC", "DBCA", "DCAB", "DCBA"), results);
	}

	@Test
	public void testPermutationTest5() throws Exception {
		List<String> prefix = Arrays.asList("");
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
	}

	@Test
	public void testPermutationTest6() throws Exception {
		List<String> prefix = Arrays.asList("");
		List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F");
		List<String> results = new ArrayList<>();

		NonAttackingQueens.permutation(prefix, list, results);
		assertEquals(factorial(list.size()), results.size());
	}

	public static int factorial(int f) {
		return ((f == 0) ? 1 : f * factorial(f - 1));
	}
}

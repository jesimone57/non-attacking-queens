import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jsimone on 5/9/17.
 */
public class NonAttackingQueensTest {

	@Test
	public void testRotateBoardSize3() {
		assertEquals("021", NonAttackingQueens.rotate("021", 3));
		assertEquals("012", NonAttackingQueens.rotate("012", 3));

		assertEquals("102", NonAttackingQueens.rotate("102", 3));
		assertEquals("201", NonAttackingQueens.rotate("120", 3));

		assertEquals("120", NonAttackingQueens.rotate("201", 3));
		assertEquals("210", NonAttackingQueens.rotate("210", 3));
	}

	@Test
	public void testRotateBoardSize8() {
		assertEquals("06471352", NonAttackingQueens.rotate("04752613", 8));
		assertEquals("04752613", NonAttackingQueens.rotate("06471352", 8));
	}


	@Test
	public void testIsNonAttackingOnDiagonalOnly2Queens() {
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("04"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("14"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("24"));
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("34")); // one file over 3 + 1 = 4 -> attack
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("54")); // one file over 5 - 1 = 4 -> attack
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("64"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("74"));

		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("40"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("41"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("42"));
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("43")); // one file over 4 - 1 = 3 -> attack
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("45")); // one file over 4 + 1 = 5 -> attack
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("46"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("47"));
	}

	@Test
	public void testIsNonAttackingOnDiagonalOnly3Queens() {
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("041"));
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("042")); // two files over 0 + 2 = 2 -> attack
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("046"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("047"));

		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("140"));
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("240")); // two files over 2 - 2 = 0 -> attack
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("640"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("740"));
	}

	@Test
	public void testIsNonAttackingOnDiagonalStandardBoard() {
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("04752613")); // 1st unique solution on an 8x8 board

		// Q in col 0 -> diagonal attack Q in col 1
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("01752643"));

		// Q in col 0 -> diagonal attack Q in col 2
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("04257613"));

		// Q in col 0 -> diagonal attack Q in col 3
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("04732615"));

		// Q in col 0 -> diagonal attack Q in col 4
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("02754613"));

		// Q in col 0 -> diagonal attack Q in col 5
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("04762513"));

		// Q in col 0 -> diagonal attack Q in col 6
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("04752163"));

		// Q in col 0 -> diagonal attack Q in col 7
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("04352617"));
	}
}

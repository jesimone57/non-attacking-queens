import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jsimone on 5/9/17.
 */
public class NonAttackingQueensTest {

	@Test
	public void testIsNonAttackingOnDiagonal() throws Exception {
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("040"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("141"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("141"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("242"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("646"));
		assertTrue(NonAttackingQueens.isNonAttackingOnDiagonal("747"));

		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("342")); // below left-side diagnal
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("243")); // below right-side diagonal
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("542")); // above left-side diagonal
		assertFalse(NonAttackingQueens.isNonAttackingOnDiagonal("245")); // above right-side diagonal

	}
}

package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void onlyBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void nestedUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][[[]"));
    }

    @Test
    public void nestedBalancedWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[this[is[a]balanced]example]"));
    }

    @Test
    public void nestedUnbalancedWithTextReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[this][example[is[not]balanced]"));
    }

    @Test
    public void stringContainsOnlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testIgnoresCurlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}{]"));
    }

    @Test
    public void testWorksForBracketPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void testWorksForBackwardsBracketPairs() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][]["));
    }

    @Test
    public void testWorksforBracketPairsAndTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[this][one][includes][text]"));
    }
}

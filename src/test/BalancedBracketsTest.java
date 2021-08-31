package test;

import main.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void charactersBetweenBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Atlas Shrugged]"));
    }

    @Test
    public void balancedBeforeCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Pygmalion"));
    }

    @Test
    public void twoPairsBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hack[er]rank]"));
    }

    @Test
    public void singleOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void extraClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("The[Left Hand]of Darkness]"));
    }

    @Test
    public void extraOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Dark Side]of the [Moon"));
    }

    @Test
    public void extra2OpeningsWithMultipleBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[][]"));
    }

    @Test
    public void spacedExtra2ClosingsWithMultipleBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][][]]]]"));
    }

    @Test
    public void unbalancedWithNewLine() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][]]\n]"));
    }
}

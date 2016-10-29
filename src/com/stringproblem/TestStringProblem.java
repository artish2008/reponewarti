package com.stringproblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStringProblem {
	StringProblem sp = new StringProblem();

	@Test
	public void testString() {
		Assert.assertEquals(sp.removeOccurences("HelloWorld", 'l'), "HeoWord");
		Assert.assertEquals(sp.removeOccurencesLib("HelloWorld", 'l'), "HeoWord");
	}
	
	@Test
	public void testNullString() {
		Assert.assertEquals(sp.removeOccurences(null, 'l'), null);
		Assert.assertEquals(sp.removeOccurencesLib(null, 'l'), null);
	}
	
	@Test
	public void testStringNoCharPresent() {
		Assert.assertEquals(sp.removeOccurences("HelloWorld", 'a'), "HelloWorld");
		Assert.assertEquals(sp.removeOccurencesLib("HelloWorld", 'a'), "HelloWorld");
	}
	
	@Test
	public void testStringWithSpecialChar() {
		Assert.assertEquals(sp.removeOccurences("HelloWorld\\", '\\'), "HelloWorld");
		Assert.assertEquals(sp.removeOccurencesLib("HelloWorld\\", '\\'), "HelloWorld");
	}
	
	@Test
	public void testStringWithOneChar() {
		Assert.assertEquals(sp.removeOccurences("H", 'H'), "");
		Assert.assertEquals(sp.removeOccurencesLib("H", 'H'), "");
	}
	
	@Test
	public void testStringWithNoChar() {
		Assert.assertEquals(sp.removeOccurences("", 'H'), "");
		Assert.assertEquals(sp.removeOccurencesLib("", 'H'), "");
	}
	
	@Test
	public void testStringWithSameChar() {
		Assert.assertEquals(sp.removeOccurences("HHHHHHHH", 'H'), "");
		Assert.assertEquals(sp.removeOccurencesLib("HHHHHHHH", 'H'), "");
	}
	
	@Test
	public void testStringWithBlankChar() {
		Assert.assertEquals(sp.removeOccurences(" ", 'H'), " ");
		Assert.assertEquals(sp.removeOccurencesLib(" ", 'H'), " ");
	}
	
	@Test
	public void testStringWithBlankCharReplace() {
		Assert.assertEquals(sp.removeOccurences("     ", ' '), "");
		Assert.assertEquals(sp.removeOccurencesLib("     ", ' '), "");
	}
}

package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.CreateBurgerHtmlCreaterDTO;

public class CreateBurgerHtmlCreaterDTOTest {

	// get count test

	@Test
	public void testGetCount1() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		int expected = 0;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCount2() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		int expected = 2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCount3() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		int expected = -2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCount4() throws Exception{
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetCount5() throws Exception{
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set count test

	@Test
	public void testSetCount1() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		int expected = 0;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCount2() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		int expected = 2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCount3() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		int expected = -2147483647;

		dto.setCount(expected);
		int actual = dto.getCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCount4() throws Exception{
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetCount5() throws Exception{
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	// get Option test
	@Test
	public void testGetOption1() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "0";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption2() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "2147483647";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption3() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "-2147483647";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption4() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "null";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption5() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption6() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = " ";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption7() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "　";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption8() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption9() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "あいう１２３";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption10() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption11() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOption12() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption1() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "0";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption2() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "2147483647";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption3() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "-2147483647";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption4() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "null";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption5() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption6() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = " ";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption7() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "　";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption8() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption9() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "あいう１２３";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption10() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption11() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOption12() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setOption(expected);
		String actual = dto.getOption();
		assertEquals(expected, actual);
	}
	// get Hidden Option test
	@Test
	public void testGetHiddenOption1() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "0";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption2() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "2147483647";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption3() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "-2147483647";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption4() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "null";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption5() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption6() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = " ";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption7() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "　";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption8() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption9() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "あいう１２３";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption10() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption11() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetHiddenOption12() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	// set Hidden Option test
	@Test
	public void testSetHiddenOption1() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "0";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption2() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "2147483647";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption3() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "-2147483647";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption4() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "null";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption5() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption6() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = " ";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption7() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "　";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption8() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption9() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "あいう１２３";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption10() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption11() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetHiddenOption12() {
		CreateBurgerHtmlCreaterDTO dto = new CreateBurgerHtmlCreaterDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setHiddenOption(expected);
		String actual = dto.getHiddenOption();
		assertEquals(expected, actual);
	}



}

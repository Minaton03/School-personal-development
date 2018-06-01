package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.BurgerOptionsDTO;

public class BurgerOptionsDTOTest {
	// get id test

	@Test
	public void testGetId1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set id test

	@Test
	public void testSetId1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// getOptionName test
	@Test
	public void testGetOptionName1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "0";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "2147483647";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "-2147483647";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName4() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "null";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName5() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName6() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = " ";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName7() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "　";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName8() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName9() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "あいう１２３";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName10() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName11() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetOptionName12() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}

	// setOptionName test
	@Test
	public void testSetOptionName1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "0";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "2147483647";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "-2147483647";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName4() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "null";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName5() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName6() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = " ";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName7() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "　";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName8() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName9() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "あいう１２３";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName10() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName11() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetOptionName12() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setOptionName(expected);
		String actual = dto.getOptionName();
		assertEquals(expected, actual);
	}

	// GetOptionPrice test

	@Test
	public void testGetOptionPrice1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 0;

		dto.setOptionPrice(expected);
		int actual = dto.getOptionPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetOptionPrice2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 2147483647;

		dto.setOptionPrice(expected);
		int actual = dto.getOptionPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetOptionPrice3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = -2147483647;

		dto.setOptionPrice(expected);
		int actual = dto.getOptionPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetOptionPrice4() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setOptionPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetOptionPrice5() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setOptionPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// SetOptionPrice test

	@Test
	public void testSetOptionPrice1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 0;

		dto.setOptionPrice(expected);
		int actual = dto.getOptionPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetOptionPrice2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = 2147483647;

		dto.setOptionPrice(expected);
		int actual = dto.getOptionPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetOptionPrice3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		int expected = -2147483647;

		dto.setOptionPrice(expected);
		int actual = dto.getOptionPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetOptionPrice4() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setOptionPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetOptionPrice5() throws Exception{
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setOptionPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// getImgUrl test
	@Test
	public void testGetImgUrl1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "0";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "2147483647";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "-2147483647";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl4() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "null";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl5() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl6() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = " ";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl7() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "　";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl8() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl9() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "あいう１２３";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl10() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl11() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgUrl12() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}

	// setImgUrl test
	@Test
	public void testSetImgUrl1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "0";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "2147483647";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "-2147483647";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl4() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "null";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl5() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl6() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = " ";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl7() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "　";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl8() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl9() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "あいう１２３";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl10() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl11() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgUrl12() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImgUrl(expected);
		String actual = dto.getImgUrl();
		assertEquals(expected, actual);
	}

	// getComment test
	@Test
	public void testGetComment1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "0";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "2147483647";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "-2147483647";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment4() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "null";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment5() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment6() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = " ";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment7() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "　";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment8() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment9() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "あいう１２３";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment10() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment11() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetComment12() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}

	// SetComment test
	@Test
	public void testSetComment1() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "0";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment2() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "2147483647";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment3() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "-2147483647";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment4() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "null";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment5() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment6() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = " ";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment7() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "　";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment8() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment9() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "あいう１２３";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment10() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment11() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetComment12() {
		BurgerOptionsDTO dto = new BurgerOptionsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setComment(expected);
		String actual = dto.getComment();
		assertEquals(expected, actual);
	}
}

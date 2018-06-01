package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.MCategoryDTO;

public class MCategoryDTOTest {

	// get id test

	@Test
	public void testGetId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
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
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	// get categoryId test

	@Test
	public void testGetCategoryId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetCategoryId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set categoryId test

	@Test
	public void testSetCategoryId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetCategoryId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// get categoryName test
	@Test
	public void testGetCategoryName1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryName12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	// set categoryName test
	@Test
	public void testSetCategoryName1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryName12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	// get categoryDescription test
	@Test
	public void testGetCategoryDescription1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCategoryDescription12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	// set categoryDescription test
	@Test
	public void testSetCategoryDescription1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCategoryDescription12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setCategoryDescription(expected);
		String actual = dto.getCategoryDescription();
		assertEquals(expected, actual);
	}

	// get insertDate test
	@Test
	public void testGetInsertDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	// set insertDate test
	@Test
	public void testSetInsertDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	// get updateDate test
	@Test
	public void testGetUpdateDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	// set updateDate test
	@Test
	public void testSetUpdateDate1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}



}

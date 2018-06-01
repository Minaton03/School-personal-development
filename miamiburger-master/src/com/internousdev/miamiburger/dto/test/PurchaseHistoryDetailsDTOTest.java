package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.PurchaseHistoryDetailsDTO;

public class PurchaseHistoryDetailsDTOTest {

	// get ProductName  test
	@Test
	public void testGetProductName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);

	}

	// set ProductName  test
	@Test
	public void testSetProductName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// get ProductNameKana  test
	@Test
	public void testGetProductNameKana1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//set ProductNameKana  test
	@Test
	public void testSetProductNameKana1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//get ImageFilePath  test
	@Test
	public void testGetImageFilePath1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//set ImageFilePath  test
	@Test
	public void testSetImageFilePath1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//get ImageFileName  test
	@Test
	public void testGetImageFileName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	//set ImageFileName  test
	@Test
	public void testSetImageFileName1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// get Price test

	@Test
	public void testGetPrice1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice4() throws Exception{
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception{
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set Price test

	@Test
	public void testSetPrice1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice4() throws Exception{
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception{
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//get ReleaseDate  test
	@Test
	public void testGetReleaseDate1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}


	//set ReleaseDate  test
	@Test
	public void testSetReleaseDate1() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate2() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate3() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate4() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate5() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate6() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate7() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate8() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate9() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate10() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate11() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate12() {
		PurchaseHistoryDetailsDTO dto = new PurchaseHistoryDetailsDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

}
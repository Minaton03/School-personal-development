package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.PurchaseHistoryDTO;

public class PurchaseHistoryDTOTest {

	// GetUserId test
	@Test
	public void testGetUserId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// SetUserId test
	@Test
	public void testSetUserId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//GetProductId test

	@Test
	public void testGetProductId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId4() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductId5() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetProductId test

	@Test
	public void testSetProductId1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId4() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProductId5() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//GetProductCount test

	@Test
	public void testGetProductCount1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount4() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductCount5() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetProductCount test

	@Test
	public void testSetProductCount1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount4() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProductCount5() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//GetPrice test

	@Test
	public void testGetPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice4() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetPrice test

	@Test
	public void testSetPrice1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice4() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception{
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetRegistDate test
	@Test
	public void testGetRegistDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// SetRegistDate test
	@Test
	public void testSetRegistDate1() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate3() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate4() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate5() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate6() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate7() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate8() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate9() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate10() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate11() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate12() {
		PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

}

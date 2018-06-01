package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.PurchaseListDTO;

public class PurchaseListDTOTest {

	//GetRegistDate test
	@Test
	public void testGetRegistDate1() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate3() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate4() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate5() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate6() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate7() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate8() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate9() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate10() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate11() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate12() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	//SetRegistDate test
	@Test
	public void testSetRegistDate1() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate3() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate4() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate5() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate6() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate7() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate8() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate9() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate10() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate11() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate12() {
		PurchaseListDTO dto = new PurchaseListDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	//GetTotalPrice test

	@Test
	public void testGetTotalPrice1() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTotalPrice2() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTotalPrice3() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = -2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTotalPrice4() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setTotalPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetTotalPrice5() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setTotalPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	//SetTotalPrice test

	@Test
	public void testSetTotalPrice1() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTotalPrice2() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTotalPrice3() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = -2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTotalPrice4() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setTotalPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetTotalPrice5() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setTotalPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	//GetAllPurchaseListNumber test

	@Test
	public void testGetAllPurchaseListNumber1() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 0;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAllPurchaseListNumber2() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 2147483647;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAllPurchaseListNumber3() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = -2147483647;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetAllPurchaseListNumber4() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setAllPurchaseListNumber(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetAllPurchaseListNumber5() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setAllPurchaseListNumber(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	//SetAllPurchaseListNumber test

	@Test
	public void testSetAllPurchaseListNumber1() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 0;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAllPurchaseListNumber2() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = 2147483647;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAllPurchaseListNumber3() {
		PurchaseListDTO dto = new PurchaseListDTO();
		int expected = -2147483647;

		dto.setAllPurchaseListNumber(expected);
		int actual = dto.getAllPurchaseListNumber();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetAllPurchaseListNumber4() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setAllPurchaseListNumber(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetAllPurchaseListNumber5() throws Exception{
		PurchaseListDTO dto = new PurchaseListDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setAllPurchaseListNumber(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


}

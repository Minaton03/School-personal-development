package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.CartInfoDTO;

public class CartInfoDTOTest {

	// Get Id test

		@Test
		public void testGetId1() {
			CartInfoDTO dto = new CartInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			CartInfoDTO dto = new CartInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			CartInfoDTO dto = new CartInfoDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			CartInfoDTO dto = new CartInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			CartInfoDTO dto = new CartInfoDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}

	// Set Id test

	@Test
	public void testSetId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// Get UserId test
	@Test
	public void testGetUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// Set UserId test
	@Test
	public void testSetUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// Get TempUserId test
	@Test
	public void testGetTempUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTempUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	// Set TempUserId test
	@Test
	public void testSetTempUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTempUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	// getProductId test

	@Test
	public void testGetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// SetProductId test

	@Test
	public void testSetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProductId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetProductCount test

	@Test
	public void testGetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductCount5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// SetProductCount test

	@Test
	public void testSetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProductCount5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetPricet test

	@Test
	public void testGetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// SetPrice test

	@Test
	public void testSetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetInsertDate test
	@Test
	public void testGetInsertDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	// SetInsertDate test
	@Test
	public void testSetInsertDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setInsertDate(expected);
		String actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	// GetUpdateDate test
	@Test
	public void testGetUpdateDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	// SetUpdateDate test
	@Test
	public void testSetUpdateDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
}

package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.PurchaseHistoryInfoDTO;

public class PurchaseHistoryInfoDTOTest {

	//GetId test

	@Test
	public void testGetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetId test

	@Test
	public void testSetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetUserId test
		@Test
		public void testGetUserId1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		// SetUserId test
		@Test
		public void testSetUserId1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//GetProductId test

		@Test
		public void testGetProductId1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId4() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setProductId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductId5() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
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
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId4() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setProductId(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductId5() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
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
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 0;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = -2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount4() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setProductCount(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductCount5() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
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
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 0;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = -2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount4() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setProductCount(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductCount5() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
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
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice4() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setPrice(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetPrice5() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
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
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice4() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMax = Integer.parseInt("214748364");
				dto.setPrice(postalMax);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetPrice5() throws Exception{
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			try{
				int postalMin = Integer.parseInt("-214748364");
				dto.setPrice(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}

		//GetInsertDate test
		@Test
		public void testGetInsertDate1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate9() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate10() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate11() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate12() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}

		//SetInsertDate test
		@Test
		public void testSetInsertDate1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate9() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate10() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate11() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate12() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}

		//GetUpdateDate test
		@Test
		public void testGetUpdateDate1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate9() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate10() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate11() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate12() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}

		//SetUpdateDate test
		@Test
		public void testSetUpdateDate1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate9() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate10() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate11() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate12() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}

}

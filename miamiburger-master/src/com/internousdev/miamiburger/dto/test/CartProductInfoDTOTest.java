package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.CartProductInfoDTO;

public class CartProductInfoDTOTest {

	// GetCartId test

	@Test
	public void testGetCartId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setCartId(expected);
		int actual = dto.getCartId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCartId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setCartId(expected);
		int actual = dto.getCartId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCartId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setCartId(expected);
		int actual = dto.getCartId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCartId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCartId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetCartId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCartId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	// SetCartId test

	@Test
	public void testSetCartId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setCartId(expected);
		int actual = dto.getCartId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCartId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setCartId(expected);
		int actual = dto.getCartId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCartId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setCartId(expected);
		int actual = dto.getCartId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCartId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCartId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetCartId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCartId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//GetProductId test

	@Test
	public void testGetProductId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
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
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProductId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
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
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductCount5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
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
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetProductCount5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//GetTotalPrice test

	@Test
	public void testGetTotalPrice1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTotalPrice2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTotalPrice3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetTotalPrice4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setTotalPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetTotalPrice5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
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
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTotalPrice2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTotalPrice3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetTotalPrice4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setTotalPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetTotalPrice5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setTotalPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetProductName test
	@Test
	public void testGetProductName1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// SetProductName test
	@Test
	public void testSetProductName1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// GetProductNameKana test
	@Test
	public void testGetProductNameKana1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// SetProductNameKana test
	@Test
	public void testSetProductNameKana1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// GetProductDescription test
	@Test
	public void testGetProductDescription1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	// SetProductDescription test
	@Test
	public void testSetProductDescription1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	//GetCategoryId test

	@Test
	public void testGetCategoryId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetCategoryId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetCategoryId test

	@Test
	public void testSetCategoryId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetCategoryId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//GetPrice test

	@Test
	public void testGetPrice1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
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
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setPrice(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setPrice(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetImageFilePath test
	@Test
	public void testGetImageFilePath1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	// SetImageFilePath test
	@Test
	public void testSetImageFilePath1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	// GetImageFileName test
	@Test
	public void testGetImageFileName1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// SetImageFileName test
	@Test
	public void testSetImageFileName1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//GetDestinationId test

	@Test
	public void testGetDestinationId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDestinationId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDestinationId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetDestinationId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setDestinationId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetDestinationId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setDestinationId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetDestinationId test

	@Test
	public void testSetDestinationId1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 0;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDestinationId2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = 2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDestinationId3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		int expected = -2147483647;

		dto.setDestinationId(expected);
		int actual = dto.getDestinationId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetDestinationId4() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setDestinationId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetDestinationId5() throws Exception{
		CartProductInfoDTO dto = new CartProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setDestinationId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// GetAddress test
	@Test
	public void testGetAddress1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}

	// SetAddress test
	@Test
	public void testSetAddress1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setAddress(expected);
		String actual = dto.getAddress();
		assertEquals(expected, actual);
	}

	// GetReleaseDate test
	@Test
	public void testGetReleaseDate1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	// SetReleaseDate test
	@Test
	public void testSetReleaseDate1() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "0";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate2() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate3() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "-2147483647";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate4() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "null";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate5() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate6() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = " ";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate7() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "　";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate8() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate9() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate10() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate11() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate12() {
		CartProductInfoDTO dto = new CartProductInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseDate(expected);
		String actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}




}

//package com.web;
//
//import com.web.NameService;
//import org.junit.Test;
//import org.springframework.web.client.RestTemplate;
//
//import static org.junit.Assert.*;
//import static org.mockito.Matchers.eq;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
///**
// * @author Javed
// */
//public class NameServiceTest {
//
//	@Test
//	public void getNameTest() throws Exception {
//		NameService.NameFeignClient nameFeignClient = mock(NameService.NameFeignClient.class);
//		doReturn("Javed").when(nameFeignClient.getName());
//		NameService nameService = new NameService(nameFeignClient);
//		String name = nameService.getName();
//		assertEquals(name, "Javed");
//	}
//
//}
package com.pw.dietician;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class DieticianApplicationTests {

//	@Test
//	void shouldFail() {
//		assertTrue(true == false);
//	}

	@Test
	void shouldPass(){
		assertTrue(true == true);
	}

}

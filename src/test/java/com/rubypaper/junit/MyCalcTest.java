package com.rubypaper.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyCalcTest {    // MyCalc 테스트하기 위한 클래스 = Test Case (DAO, ServiceImpl 등을 테스트함) 
	
	private MyCalc calc;

	/*
	// @BeforeAll    // 글로벌 초기화 메서드 (테스트 클래스의 모든 메서드 전 한번만 실행)
	static void setUpBeforeClass() throws Exception {    
		System.out.println("===> setUpBeforeClass()");
	}

	// @AfterAll    // 모든 메서드 종료후 한번만 실행됨 
	static void tearDownAfterClass() throws Exception {
		System.out.println("===> tearDownAfterClass()");
	}
	*/

	@BeforeEach    // 모든 테스트 메서드 후 동작 
	void setUp() throws Exception {
		System.out.println("---> setUp()");
		calc = new MyCalc(10,3);    // 테스트 전 세팅 (재사용 가능) 
	}

	@AfterEach    // 모든 테스트 메서드 전 동작 
	void tearDown() throws Exception {
		System.out.println("---> tearDown()");
		calc = null;    // 테스트 후 복원
	}

	@Test    // 무조건 실행되는 메서드 
	void testPlus() {
		System.out.println("---> testPlus() 테스트");
		assertEquals(13, calc.plus());    // 내가 예상한 값과 리턴값 같다면 테스트 통과 
	}

	@Test
	void testMinus() {
		System.out.println("--->> testMinus() 테스트");
		assertEquals(7, calc.minus());
	}

}

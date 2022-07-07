package com.rubypaper.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


// new JUnit Test Case (Jupiter, @ 4개 체크박스 다 체크, browse MyCalc, next, plus() minus() 체크)
// MyCalc 테스트하는 클래스 = Test Case (DAO, ServiceImpl 등을 테스트함) 
// 메인 메서드 없이 실행 가능 
// 테스트 코드, 데이터 재사용 가능 

// help, marketplace, jsp 검색, 플러그인 설치, restart 

class MyCalcTest {    
	
	
	@Autowired
	private MyCalc calc;

	
	/* 잘 사용 안함 
	// @BeforeAll    // 글로벌 초기화 메서드 (테스트 클래스의 모든 메서드 전 한번만 실행)
	static void setUpBeforeClass() throws Exception {    
		System.out.println("===> setUpBeforeClass()");
	}

	// @AfterAll    // 모든 메서드 종료후 한번만 실행됨 
	static void tearDownAfterClass() throws Exception {
		System.out.println("===> tearDownAfterClass()");
	}
	*/

	
	/* 보통 @Autowired로 할당
	@BeforeEach    // 모든 테스트 메서드 전 동작 
	void setUp() throws Exception {
		System.out.println("---> setUp()");
		calc = new MyCalc(10,3);    // 테스트 전 초기화 (재사용 가능) 
	}

	 
	@AfterEach    // 모든 테스트 메서드 후 동작 
	void tearDown() throws Exception {
		System.out.println("---> tearDown()");
		calc = null;    // 이후 가비지 콜렉션 
	}
	*/
	

	@Test    // 무조건 실행되는 테스트 메서드 
	void testPlus() {
		System.out.println("===> testPlus() 테스트");
		assertEquals(13, calc.plus());    // 예상한 값과 리턴값(매개변수) 같다면 테스트 통과  
	}

	@Test
	void testMinus() {
		System.out.println("===> testMinus() 테스트");
		assertEquals(7, calc.minus());
	}

}

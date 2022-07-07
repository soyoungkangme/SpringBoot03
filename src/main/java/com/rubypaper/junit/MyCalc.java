package com.rubypaper.junit;

public class MyCalc {
	
	private int x;
	private int y;
	
	public MyCalc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int plus() {
		/*
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("sum : " + (x+y));
		*/
		return x + y;
	}
	
	public int minus() {
		return x - y;
	}
	
	
	/*
	public static void main(String[] args) {
		MyCalc calc = new MyCalc(10,3);
		System.out.println(calc.plus());
	}
	*/
}


// 이렇게 테스트하면 
// 입출력이 많아서 성능이 떨어지고, 테스트 후 삭제하므로 테스트 코드 재사용이 어려움
// -> 특정 클래스를 테스트 하기 위한 별도의 객체 만들어야함 = test case (MyCalcTest)

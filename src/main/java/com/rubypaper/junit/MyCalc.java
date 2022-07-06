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
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
//		System.out.println("sum : " + (x+y));
		return x + y;
	}
	
	public int minus() {
		return x - y;
	}
	
	/* 위 두개의 메서드 테스트할때 이 클래스에 main() 만들지 않음 
	 * 전부 다 출력 코드 => 성능 떨어짐, 재사용 안함 
	 * 
	 */
}

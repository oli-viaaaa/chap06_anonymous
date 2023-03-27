package com.javalab.anonymous.pkg00;

// Tire 객체를 멤버로 갖는 클래스
public class Car {
	// 필드선언(타이어 클래스 타입을 필드로 갖게됨)
	private Tire tire1 = new Tire(); // 부모
	private Tire tire2 = new Tire() {// 익명자식(상속 관계 구현)
		@Override // 상속관계에서만 해당 됨
		public void roll() { // 익명 자식 객체 탄생
			System.out.println("익명 자식 타이어 객체 1이 굴러갑니다.");
		}
	}; // ; 이 반드시 들어가야함
	
	// 메소드 선언
	public void run1() {
		tire1.roll(); // 부모
		tire2.roll(); // 자식 오버라이드된 메소드 호출
	}
	
	// 메소드 내에서 익명 구현 객체 생성
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	// 다형성 구현(매개변수의 다형성)
	public void run3(Tire tire) {
		tire.roll();
	}

}





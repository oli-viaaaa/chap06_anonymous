package com.javalab.anonymous.pkg03;

/*
 * Anonymous 클래스를 실행시키는 실행클래스
 */

public class AnonymousMain {

	public static void main(String[] args) {

		// Anonymous 객체 생성 // Anonymous클래스에 모든것이 담겨 있어 객체 생성
		Anonymous anony = new Anonymous();

		// Anonymous 객체의 필드인 익명 객체가 갖고 있는 메소드 호출
		anony.person.wake(); // anony.person : 익명 객체 참조 (주소)
		System.out.println();

		// 익명 객체를 생성하는 메소드 호출
		anony.method1();
		System.out.println();

		// 메소드의 파라미터로 사용할 익명 객체 생성
		// (괄호) 안에서 익명 객체 생성
		anony.method2(new Person() {
			// 익명 객체의 study() 메소드
			public void study() {
				System.out.println("공부하러 갑니다.");
			}

			@Override // 부모가 갖고 있는 메소드 재정의
			public void wake() {
				System.out.println("7시 30분에 일어납니다.");
				study(); // study()메소드 호풀
			}
		}); // 익명 객체 정의 끝

	}

}

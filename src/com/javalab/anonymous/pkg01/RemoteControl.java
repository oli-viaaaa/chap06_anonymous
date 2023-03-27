package com.javalab.anonymous.pkg01;

/*
 * 인터페이스(ex.ATM)
 * 	- 추상메소드만 갖고 있음
 * 	- 추상메소드는 자식 객체들이 의무적으로 구현해야함
 */

public interface RemoteControl {
	// 추상 메소드(몸통이 없는 껍데기)
	void turnOn();
	void turnOff();
}

package com.Interface;

public class Honda implements Robot {

	@Override
	public void start() {
		System.out.println("greetings from Asimo");
		
	}

	@Override
	public void walk() {
		System.out.println("Asimo is walking");
		
	}

	@Override
	public void run() {
		System.out.println("Asimo is running");
		
	}

	@Override
	public void jump() {
		System.out.println("Asimo is jumping");
		
	}

	@Override
	public void stop() {
		System.out.println("Power off\n Asimo in sleep mode");
		
	}

}

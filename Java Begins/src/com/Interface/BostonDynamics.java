package com.Interface;

public class BostonDynamics implements Robot {
	
	@Override
	public void start() {
		System.out.println("greetings from Atlas");
		
	}

	@Override
	public void walk() {
		System.out.println("Atlas is walking");
		
	}

	@Override
	public void run() {
		System.out.println("Atlas is running");
		
	}

	@Override
	public void jump() {
		System.out.println("Atlas is jumping");
		
	}

	@Override
	public void stop() {
		System.out.println("Power off\n Atlas in sleep mode");
		
	}

}

package com.Interface;

public class Main {

	public static void main(String[] args) {
		
		Robot asimo = new Honda();
		Robot atlas = new BostonDynamics();
		
		asimo.start();
		asimo.run();
		asimo.walk();
		asimo.jump();
		asimo.stop();
		
		atlas.start();
		atlas.run();
		atlas.walk();
		atlas.jump();
		atlas.stop();
		
		
		
		
	}

}

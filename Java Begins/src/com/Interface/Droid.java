package com.Interface;

public class Droid {
	String  name;
	int height;
	int weight;
	int payload;
	String powerType;
	
	/////////////////
	// Constructor //
	/////////////////
	
	/**
	 * Default Constructor
	 */
	public Droid() {}

	/**
	 * @param name
	 * @param height
	 * @param weight
	 * @param payload
	 * @param powerType
	 */
	public Droid(String name, int height, int weight, int payload, String powerType) {
		setName(name);
		setHeight(height);
		setWeight(weight);
		setPayload(payload);
		setPowerType(powerType);
	}

	///////////////////////
	// Getters / Setters //
	///////////////////////

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return this.weight;
	}

	/**
	 * @return the payload
	 */
	public int getPayload() {
		return this.payload;
	}

	/**
	 * @return the powerType
	 */
	public String getPowerType() {
		return this.powerType;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(int payload) {
		this.payload = payload;
	}

	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	
	/////////////
	// Methods //
	/////////////
	
	public void print() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "Droid name: " + getName() + "\nheight: " + getHeight() + "\nweight: " + getWeight() + "\npayload: " + getPayload() + "\npower type: " + getPowerType();
	}
	
	public void start() {
		System.out.println(getName() + " is on");
	}
	
	public void walk() {
		System.out.println(getName() + " is walking");
	}
	
	public void run() {
		System.out.println(getName() + " is running");
	}
	
	public void jump() {
		System.out.println(getName() + " is jumping");
	}
	
	public void stop() {
		System.out.println(getName() + " is off");
	}
}

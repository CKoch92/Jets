package com.skilldistillery.jets.entity;

public abstract class Jet {
private String model;
private double speed;
private int range;
private long price;


public Jet(String model, double speed, int range, long price) {
	super();
	this.model = model;
	this.speed = speed;
	this.range = range;
	this.price = price;
}

public void fly() {
	displayJet();
	System.out.println("The " + model + "jet can fly for " + (speed/range) + " hours");
	System.out.println();
}

public double getSpeedInMPH() {
	return speed;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public int getRange() {
	return range;
}

public void setRange(int range) {
	this.range = range;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

@Override
public String toString() {
	return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
}

public void displayJet() {
	String jetData = this.toString();
	System.out.println(jetData);
}


}

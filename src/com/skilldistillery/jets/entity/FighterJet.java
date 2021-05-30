package com.skilldistillery.jets.entity;

public class FighterJet extends Jet{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println("pew, pew, pew...Goose!? NOOOOOOOOOO!!!!");
	}
}

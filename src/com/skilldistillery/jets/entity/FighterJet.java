package com.skilldistillery.jets.entity;

public class FighterJet extends Jet{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight(Jet jet) {
		System.out.println(jet.getModel() + " going in for a dogfight");
		System.out.println();
	}
}

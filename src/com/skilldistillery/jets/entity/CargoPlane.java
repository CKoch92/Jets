package com.skilldistillery.jets.entity;

public class CargoPlane extends Jet {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		}
	
	public void loadCargo(Jet jet) {
		System.out.println("Nothing to see here. Just loading some cargo on " + jet.getModel());
		System.out.println();
	}


		
	}



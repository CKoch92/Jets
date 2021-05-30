package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entity.*;

public class JetsApplication {
	private AirField airfield = new AirField();
	Scanner scanner = new Scanner(System.in);
	List<Jet> jetList = airfield.getJets();
	
	public JetsApplication() {}

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		boolean keepGoing = true;
		while (keepGoing) {
		ja.displayUserMenu();
		keepGoing = ja.lauch();
		}
	}

private boolean lauch() {
	boolean loop = true;

		System.out.print("Enter the number of the menu option you wish to select. ");
		int menuSelection = (int) scanner.nextInt();
		System.out.println();

		switch (menuSelection) {
		case 1:
			listFleet();
			break;
		
		case 2:
			flyJets();
			break;

		case 3:
			fastestJet();
			break;

		case 4:
			farthestJet();
			break;

		case 5:
			loadCargo();
			break;
		
		case 6:
			fight();
			break;
			
		case 7:
			addJet();		
			break;
			
		case 8:
			removeJet();
			break;
			
		case 9:
			loop = false;
			break;
		}
		return loop;
	}

	private void displayUserMenu() {
		System.out.println();
		System.out.println("Please select an option from the menu below: ");
		System.out.println();
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println();
	}

	private void listFleet() {
		for (Jet jet : jetList) {
			jet.displayJet();
		}
	}
	
	private void flyJets() {
		for (Jet jet : jetList) {
			jet.fly();
		}
	}

	private void fastestJet() {
		Jet fastestJet = null;
		double fastestSpeed = 0.0;
		for (Jet jet : jetList) {
			if (fastestSpeed < jet.getSpeed()) {
				fastestJet = jet;
				fastestSpeed = jet.getSpeed();
			}
		}
		System.out.println("Here is your fastest jet with a speed of " + fastestSpeed + "mph");
		System.out.println(fastestJet);
	}

	private void farthestJet() {
		Jet farthestJet = null;
		double farthestRange = 0.0;
		for (Jet jet : jetList) {
			if (farthestRange < jet.getRange()) {
				farthestJet = jet;
				farthestRange = jet.getRange();
			}
		}
		System.out.println("Here is your farthest jet with a range of " + farthestRange + "miles");
		System.out.println(farthestJet);
	}

	private void loadCargo() {
		for (Jet jet : jetList) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo(jet);
			}
		}
	}
	
	private void fight() {
		for (Jet jet : jetList) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight(jet);
			}
		}
		System.out.println("pew, pew, pew...Goose!?...NOOOOOOOO!!!");
		System.out.println();
	}

	private void addJet() {
		System.out.print("What is the model of the jet you wish to add? ");
		String userModel = scanner.next();
		System.out.println();
		
		System.out.print("What is the high spped of the jet you wish to add? ");
		double userSpeed = scanner.nextDouble();
		System.out.println();
		
		System.out.print("What is the range in miles of the jet you wish to add? ");
		int userRange = scanner.nextInt();
		System.out.println();
		
		System.out.print("What is the high spped of the jet you wish to add? ");
		long userPrice = scanner.nextLong();
		System.out.println();
		
	JetImpl userJet = new JetImpl(userModel, userSpeed, userRange, userPrice);
	jetList.add(userJet);	
	}

	private void removeJet() {
		System.out.println("Enter the number of the jet you wish to remove from the fleet");
		System.out.println();
		
		int i = 1;
		for (Jet jet : jetList) {
			System.out.println(i + ": " + jet);
			i++;
		}
		
		int userRemove = scanner.nextInt();
		jetList.remove((userRemove-1));
		System.out.println(jetList);
	}
}

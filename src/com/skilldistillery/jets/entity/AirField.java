package com.skilldistillery.jets.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AirField {
private List<Jet> jets;


public AirField() {
	
	jets = new ArrayList<>();
	readJets();
	
}

public void addJet(Jet jet) {
	jets.add(jet);
}

public void readJets() {
	
	try {
		BufferedReader file = new BufferedReader(new FileReader("jets.txt"));
		String line;
		while ((line = file.readLine()) != null) {
			String[] lineAsArray = line.split(",");
			
			if (lineAsArray[4].equals("F")){
				FighterJet fj = new FighterJet(lineAsArray[0], Double.parseDouble(lineAsArray[1]), Integer.parseInt(lineAsArray[2]), Long.parseLong(lineAsArray[3]));
				addJet(fj);
			}
			else if (lineAsArray[4].equals("C")) {
				CargoPlane cp = new CargoPlane(lineAsArray[0], Double.parseDouble(lineAsArray[1]), Integer.parseInt(lineAsArray[2]), Long.parseLong(lineAsArray[3]));
				addJet(cp);
			}
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

public List<Jet> getJets() {
	return jets;
}

public void setJets(List<Jet> jets) {
	this.jets = jets;
}




}

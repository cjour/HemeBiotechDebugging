package com.hemebiotech.analytics;

import java.util.List;

public class WriteSymptomOutputData implements ISymptomWriter {

	private List<String> listOfSymptom;
	
		
	public WriteSymptomOutputData(List<String> listOfSymptom) {
		super();
		setListOfSymptom(listOfSymptom);;
	}
	
	
	public void setListOfSymptom(List<String> listOfSymptom) {
		
		if(listOfSymptom.size() <= 0) {
			
			throw new Error("Your list doesn't contain any items. Try again with a valid list.");
		}
		
		this.listOfSymptom = listOfSymptom;
	}



	@Override
	public List<String> WriteSymptomsOutput() {
		return null;
	}

}

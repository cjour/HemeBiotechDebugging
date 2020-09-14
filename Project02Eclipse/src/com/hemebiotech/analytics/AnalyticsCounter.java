package com.hemebiotech.analytics;


import java.util.TreeMap;

public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile readMyFile = new ReadSymptomDataFromFile("symptoms.txt");		
		SymptomCounter listMySymptom = new SymptomCounter();
		WriteSymptomOutputData getMyOutput = new WriteSymptomOutputData();
		
		TreeMap<String, Integer> listOfSymptom = listMySymptom.CountSymptom(listMySymptom.ListSymptoms(readMyFile.GetSymptoms()), readMyFile.GetSymptoms());
		getMyOutput.WriteSymptomsOutput(listOfSymptom);
		
			
		
	}
}

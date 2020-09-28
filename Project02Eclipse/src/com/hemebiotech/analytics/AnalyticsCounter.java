package com.hemebiotech.analytics;


import java.util.TreeMap;

public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile readMyFile = new ReadSymptomDataFromFile("C:\\Users\\jourc\\Desktop\\All\\Developpement\\JAVA\\OpenClassrooms\\p2_jourdain_clement\\Project02Eclipse\\symptoms.txt");		
		SymptomCounter listMySymptom = new SymptomCounter();
		WriteSymptomOutputData getMyOutput = new WriteSymptomOutputData();
		
		//First read input file, then extract symptom and finally count them.
		TreeMap<String, Integer> listOfSymptom = listMySymptom.countSymptom(listMySymptom.listSymptoms(readMyFile.getSymptoms()), readMyFile.getSymptoms());
		
		//writing output to the specified path.
		getMyOutput.writeSymptomsOutput(listOfSymptom);
		
			
		
	}
}

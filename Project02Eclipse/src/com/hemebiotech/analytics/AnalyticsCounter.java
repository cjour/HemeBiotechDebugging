package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.util.HashMap;

public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile readMyFile = new ReadSymptomDataFromFile("symptoms.txt");		
		SymptomCounter listMySymptom = new SymptomCounter();
		
		HashMap<String, Integer> listOfSymptom = listMySymptom.SortSymptomByAlphabeticalOrder(listMySymptom.CountSymptom(listMySymptom.ListSymptoms(readMyFile.GetSymptoms()), readMyFile.GetSymptoms()));
		System.out.println(listOfSymptom);
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		
		writer.close();
	}
}

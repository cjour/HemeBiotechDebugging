package com.hemebiotech.analytics;


import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile readMyFile = new ReadSymptomDataFromFile("../symptoms.txt");		
		SymptomCounter listMySymptom = new SymptomCounter();
		WriteSymptomOutputData getMyOutput = new WriteSymptomOutputData("../result.txt");
		
		//reading the input file and extracting ALL data in an array
		var arrayOfSymptom = readMyFile.getSymptoms();
		
		//extracting symptoms into a collection and initializating their occurences to 0
		var arrayOfSymptomWithoutDuplicate = listMySymptom.listSymptoms(arrayOfSymptom);
		
		//counting occurences in arrayOfSymptom and adding them into arrayOfSymptomAndTheirsOccurences
		TreeMap<String, Integer> arrayOfSymptomAndTheirsOccurences = listMySymptom.countSymptom(arrayOfSymptomWithoutDuplicate, arrayOfSymptom);
		
		//Having logs in console of output
		for(Map.Entry<String, Integer> line : arrayOfSymptomAndTheirsOccurences.entrySet()){
			System.out.println(line);
		}
		
		//writing output to the specified path.
		getMyOutput.writeSymptomsOutput(arrayOfSymptomAndTheirsOccurences);
		
	}
}

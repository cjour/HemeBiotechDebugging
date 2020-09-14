package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomCounter implements ISymptomCounter{
	
	
	@Override
	public HashMap<String, Integer> ListSymptoms(List<String> arrayOfSymptom) {
		
		List<String> arrayOfSymptomIntermediaire = new ArrayList<String>();
		arrayOfSymptomIntermediaire.add(0, arrayOfSymptom.get(0));
		
		HashMap<String, Integer> arrayOfSymptomAndOccurence = new HashMap<String, Integer>();
		  
		for (int i = 0; i < arrayOfSymptom.size(); i++) { for(int j = 0 ; j <
		  arrayOfSymptomIntermediaire.size() ; j++) { 
			if (arrayOfSymptom.get(i) != arrayOfSymptomIntermediaire.get(j)) {
				arrayOfSymptomAndOccurence.put(arrayOfSymptom.get(i).toString(), 0); 
				} 
			}
		}
		return arrayOfSymptomAndOccurence;
		 
	}

	@Override
	public HashMap<String, Integer> CountSymptom(HashMap<String, Integer> arrayOfSymptomAndOccurence, List<String> arrayOfSymptom) {
		for(Map.Entry<String, Integer> line : arrayOfSymptomAndOccurence.entrySet())
			  { int count=0; for (int i = 0; i < arrayOfSymptom.size(); i++) { if
			 (line.getKey().equals(arrayOfSymptom.get(i))){ count++; }
			 
			} arrayOfSymptomAndOccurence.put(line.getKey(), count); }
		
		return arrayOfSymptomAndOccurence;
	}

	@Override
	public HashMap<String, Integer> SortSymptomByAlphabeticalOrder(HashMap<String, Integer> hashMapToSort) {
		hashMapToSort.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                .thenComparing(Map.Entry.comparingByKey()));
		return hashMapToSort;
	}

}

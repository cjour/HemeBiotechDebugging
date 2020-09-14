package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomCounter implements ISymptomCounter{
	
	
	@Override
	public TreeMap<String, Integer> ListSymptoms(List<String> arrayOfSymptom) {
		
		List<String> arrayOfSymptomIntermediaire = new ArrayList<String>();
		arrayOfSymptomIntermediaire.add(0, arrayOfSymptom.get(0));
		
		TreeMap<String, Integer> arrayOfSymptomAndOccurence = new TreeMap<String, Integer>();
		  
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
	public TreeMap<String, Integer> CountSymptom(TreeMap<String, Integer> arrayOfSymptomAndOccurence, List<String> arrayOfSymptom) {
		for(Map.Entry<String, Integer> line : arrayOfSymptomAndOccurence.entrySet())
			  { int count=0; for (int i = 0; i < arrayOfSymptom.size(); i++) { if
			 (line.getKey().equals(arrayOfSymptom.get(i))){ count++; }
			 
			} arrayOfSymptomAndOccurence.put(line.getKey(), count); }
		
		return arrayOfSymptomAndOccurence;
	}

	
}

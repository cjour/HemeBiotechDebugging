package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;



/**
 * Anything that will manipulate data from a source
 * The important part is, the return value from the operation, which is a list of strings or a HashMap,
 * that, in both cases, must not contain duplications.
 * 
 */

public interface ISymptomCounter {

	
	
		/**
		 * If no data available, return an empty List.
		 * 
		 * @return a raw listing of all symptoms obtained from a data source, duplicates are possible/probable
		 */
		TreeMap<String, Integer> ListSymptoms(List<String> arrayOfSymptom);
		
		
		/**
		 * If you want to sore the list you need to do it yourself.
		 * If no data available, return an empty List.
		 * 
		 * @return a raw listing of symptoms and theirs number of occurrences in alphabetical order.
		 */
		TreeMap<String, Integer> CountSymptom (TreeMap<String, Integer> arrayOfSymptomAndOccurence, List<String> arrayOfSymptom);

		


	}

	



package com.hemebiotech.analytics;

import java.util.HashMap;

import java.util.List;



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
		HashMap<String, Integer> ListSymptoms(List<String> arrayOfSymptom);
		
		
		/**
		 * If you want to sore the list you need to do it yourself.
		 * If no data available, return an empty List.
		 * 
		 * @return a raw listing of symptoms and theirs number of occurrences.
		 */
		HashMap<String, Integer> CountSymptom (HashMap<String, Integer> arrayOfSymptomAndOccurence, List<String> arrayOfSymptom);

		/**
		 * 
		 * If no data available, return an empty List.
		 * 
		 * @return an  alphabetical ordered list of symptoms and theirs number of occurrences.
		 */
		HashMap<String, Integer> SortSymptomByAlphabeticalOrder( HashMap<String, Integer> hashMapToSort);



	}

	



package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 *Manipulate strings from List, Treemap. 
 *
 */

public interface ISymptomCounter {

		/**
		 * Clean a list of duplicated strings.
		 * @param arrayOfSymptom : the array you want to clean from duplicated strings.
		 * @return A list of strings with no duplicates.
		 */
		TreeMap<String, Integer> listSymptoms(List<String> arrayOfSymptom);
		
		
		/**
		 * Read a list of strings and count their respective occurrences.
		 * @param arrayOfSymptomAndOccurence : a TreeMap containing the strings value, as mapped value, you want to count. 
		 * @param arrayOfSymptom : an array which represents the strings values you want to count. <b>Must not contain duplicate.</b>
		 * @return A list of strings and theirs number of occurrences in alphabetical order.
		 */
		TreeMap<String, Integer> countSymptom (TreeMap<String, Integer> arrayOfSymptomAndOccurence, List<String> arrayOfSymptom);

		


	}

	



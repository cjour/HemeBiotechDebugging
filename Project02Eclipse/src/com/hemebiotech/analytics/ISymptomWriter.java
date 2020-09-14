package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Anything that will write source from symptom data.
 * The important part is, the return value from the operation, which is a list of strings,
 * that may not contain many duplications
 * 
 * The implementation must return an order list
 * 
 */
// Each interface must be declared in its own file.
  
public interface ISymptomWriter {
	/** Should return at least a one size HashMap
	 * 
	 * @return a HashMap with alphabetical ordered symptoms
	 */

	void WriteSymptomsOutput(TreeMap<String, Integer> listOfSymptom);
}

package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 */
public interface ISymptomReader {
	
	/**
	 * 
	 * @return A list of strings.
	 */
	
	List<String> getSymptoms ();
}

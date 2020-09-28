package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * A writer outputting alphabetical ordered data in a file.txt
 */

public interface ISymptomWriter {
	/**
	 * 
	 * @param listOfSymptom : a TreeMap of strings with their respective occurrences.
	 */

	void writeSymptomsOutput(TreeMap<String, Integer> listOfSymptom);
}

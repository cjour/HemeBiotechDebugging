package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomOutputData implements ISymptomWriter {
	
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to location where you want to generate your output.
	 */
		
	public WriteSymptomOutputData(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void writeSymptomsOutput(TreeMap<String, Integer> listOfSymptom) {
		
		if (this.filepath != null) {
			try {
				FileWriter writer = new FileWriter (this.filepath);
				for (Map.Entry<String, Integer> entry : listOfSymptom.entrySet()) {
					writer.write(entry.getKey().toString() + " : " + entry.getValue().toString() + "\n");
					writer.flush();
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

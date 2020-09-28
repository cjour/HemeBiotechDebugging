package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomOutputData implements ISymptomWriter {

		
	@Override
	public void writeSymptomsOutput(TreeMap<String, Integer> listOfSymptom) {
		
		try {
			//output path is written in this method but maybe it is better to inject it through the constructor.
			FileWriter writer = new FileWriter ("C:\\Users\\jourc\\Desktop\\All\\Developpement\\JAVA\\OpenClassrooms\\p2_jourdain_clement\\Project02Eclipse\\result.txt");
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

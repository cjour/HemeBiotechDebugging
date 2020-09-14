package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomOutputData implements ISymptomWriter {

	
	@Override
	public void WriteSymptomsOutput(TreeMap<String, Integer> listOfSymptom) {
		
		try {
			FileWriter writer = new FileWriter ("C:\\Users\\jourc\\Desktop\\All\\Developpement\\JAVA\\OpenClassrooms\\HemeBiotechDebugging\\Project02Eclipse\\result.txt");
			for (Map.Entry<String, Integer> entry : listOfSymptom.entrySet()) {
				writer.write(entry.getKey().toString() + " : " + entry.getValue().toString() + "\n");
				writer.flush();
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

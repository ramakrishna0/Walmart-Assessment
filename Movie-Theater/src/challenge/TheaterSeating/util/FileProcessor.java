package challenge.TheaterSeating.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FileProcessor {
	private final String OUTPUT = "D:\\Walmart Assessment\\Movie-Theater\\output.txt";

	public void writeToFile(LinkedHashMap<String, ArrayList<String>> hm) {
		System.out.println("********************* BOOKINGS **********************");
		BufferedWriter wr = null;
		try {
			wr = new BufferedWriter(new FileWriter(OUTPUT));
			Iterator<Entry<String, ArrayList<String>>> itr = hm.entrySet().iterator();
			while (itr.hasNext()) {
				Entry<String, ArrayList<String>> pairs = itr.next();
				String str = pairs.getKey() + " " + pairs.getValue();
				System.out.print(str + "\n");
				wr.write(str + "\n");
			}
			wr.close();
			System.out.println("Output file path: " + OUTPUT);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

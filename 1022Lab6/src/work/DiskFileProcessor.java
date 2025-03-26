package work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DiskFileProcessor {
	
	public static String[] readFiles (String[] names){
		
		String[] lines = new String[names.length];
		FileReader f;
		for (int i = 0; i < names.length; i++) {
			// Reading file from path in local directory
			try {
				f = new FileReader("src/work/" + names[i]);
				// Creating object as one of ways of taking input
				BufferedReader b = new BufferedReader(f);
				try {
					lines[i] = b.readLine();
					b.close();
				} catch(IOException exception) {
					lines[i] = "IO Error";
				}
			} catch(FileNotFoundException exception) {
				lines[i] = "FILE DOESN'T EXIST";
			}	
		}	
		return lines;	  
	}
}
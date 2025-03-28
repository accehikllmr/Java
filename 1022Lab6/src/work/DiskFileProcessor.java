///////////////////////////////////////////////////////////////////////////
//Full Name : Michel Clark
//Yorku Email : mciehl@my.yorku.ca
//Date : March 28, 2025
//Authenticity Declaration:
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider. This submitted
//piece of work is entirely of my own creation.
///////////////////////////////////////////////////////////////////////////

package work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DiskFileProcessor {
	
	public static String[] readFiles (String[] names){
		
		// Array object to store output from file, either error message for exception or first line of file
		String[] lines = new String[names.length];
		// FileReader object, java implementation
		FileReader f;
		// iterating through Array object, with has null values, but whose length is equal to the number of files in names Array object
		for (int i = 0; i < names.length; i++) {
			try {
				/* instantiating a new FileReader object, passing path of file and appending String for its name, taken from argument
				 * if unsuccessful (file not found), throws exception
				 */
				f = new FileReader("src/work/" + names[i]);
				// BufferedReader object, java implementation, used to take input from file
				BufferedReader b = new BufferedReader(f);
				// trying to read first line of file
				try {
					lines[i] = b.readLine();
					// if successful (no exception thrown) close the file and move on to the next one
					b.close();
				// if unsuccessful, catch thrown exception
				} catch(IOException exception) {
					lines[i] = "IO Error";
				}
			// if first try block throws exception, catch it
			} catch(FileNotFoundException exception) {
				lines[i] = "FILE DOESN'T EXIST";
			}	
		}	
		return lines;	  
	}
}
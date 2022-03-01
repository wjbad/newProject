package newPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWritingToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Creating a file on your file system
		String testFile = "C:\\Users\\wessel.badenhorst\\OneDrive - Spinnaker Software\\Wessel\\Test Automation Course\\temp.txt";
		// create an object of the java file class
		File FC = new File(testFile);
		// Create the file
		FC.createNewFile(); // Create file
		
		//Writing In to file
		//Creating Object of java Filewriter and BufferedWriter class.
		FileWriter FW = new FileWriter(testFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("This Is The First Line."); //Writing In To File
		BW.newLine(); // To write next string on new line.
		BW.write("this is the third line");
		BW.close();
		
		//Reading from File.
		//Creating Object of java FileReader and BufferedReader class
		FileReader FR = new FileReader(testFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		
		//Loop to read all lines one by one from file and print it.
		while((Content = BR.readLine())!= null){
			System.out.println(Content);
		}
		
	}

}

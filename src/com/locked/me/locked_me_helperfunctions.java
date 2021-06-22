package com.locked.me;
import java.io.*;
import java.util.*;

public class locked_me_helperfunctions {
	//display welcome screen
	public void welcome_screen() {
		System.out.println("Locked ME File Handler");
		System.out.println("-dev: Himesh Chopra");
		System.out.println("Press \"l or L\" to list files.");
		System.out.println("Press \"d or D\" for further details");
	}
	
	//display further details
	public void further_details() {
		System.out.println("Press \"a or A\" to Add a file.");
		System.out.println("Press \"r or R\" to remove a file.");
		System.out.println("Press \"s or S\" to search a file.");
	}
	
	
	//get the key pressed quit if first character pressed is 'q'
	public char get_user_inp() {
		Scanner sc= new Scanner(System.in);
		char chr=sc.next().replaceAll("\\s", "").charAt(0);
		return chr;
	}
	public List<String> get_file_names() {
		List<String> results = new ArrayList<String>();


		File[] files = new File("./files_dir").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		Collections.sort(results); //sorting in ascending order
		return results;
	}

}

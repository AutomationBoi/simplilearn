package com.locked.me;
import java.io.*;
import java.util.*;

public class locked_me_helperfunctions {
	//display welcome screen
	String file_path="./files_dir/";
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
		System.out.println("Press \"q or Q\" to quit.");
	}
	
	
	//get the key pressed quit if first character pressed is 'q'
	public char get_user_inp() {
		Scanner sc= new Scanner(System.in);
		char chr=sc.next().replaceAll("\\s", "").charAt(0);
		return chr;
	}
	
	//check if dir doesnt exist then create
	public void create_dir() {
		File dir=new File(file_path);
		if (!dir.isDirectory()) {
            dir.mkdir();
		}
	}
	
	
	//get file names
		
	public String get_user_file_name() {
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		return filename;
	}
	
	
	//List filenames in file_path
	public void get_file_names() {
		List<String> results = new ArrayList<String>();

		try {
		File[] files = new File(file_path).listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 
		
		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		Collections.sort(results); //sorting in ascending order
		System.out.println("List of files present in directory "+file_path+":\n"+results);
		}catch(Exception e){
			create_dir();
					}
	}
    //Add file to file_path
	public void add_file(String file_name) {
    	try {
            File file = new File(file_path+file_name);
            file.createNewFile();
            System.out.println("File added " + file_path+file_name);
           	
         } catch(Exception e) {
        	 create_dir();
        	 System.out.println("Cannot Create file "+file_path+file_name);
        	
         }
    	
    }
	
	//Remove file to file_path
	public void remove_file(String file_name) {
            File file = new File(file_path+file_name);
            if(file.delete())
            {
                System.out.println(file_name+" deleted successfully");
            }
            else
            {
                System.out.println("Failed to delete "+file_name);
                create_dir();
            }
    	
    }
	
	public void search_file(String file_name) {
		File dir = new File(file_path);
		FileFilter filter=new FileFilter(file_name);
		List<String> results = new ArrayList<String>();
		try {
			String[] file_list = dir.list(filter);
			for (String file : file_list) {
			      results.add(file);
			    }
			System.out.println("List of Files matching name "+file_name+" :\n"+results);
		}catch(Exception e) {
			create_dir();
			System.out.println("Exception occured while searching :\n"+e.toString());
		}
	}

	class FileFilter implements FilenameFilter {
	    
	    String pattern;
	    
	    
	    public FileFilter(String pattern)
	    {
	        this.pattern = pattern;
	    }
	    
	    
	    public boolean accept(File dir, String name)
	    {
	        return name.startsWith(pattern);
	    }
	}


}

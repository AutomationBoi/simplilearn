package com.locked.me;
import java.io.*;
import java.util.*;

public class locked_me_helperfunctions {
	//display welcome screen
	public void welcome_screen() {
		System.out.println("Locked ME File Handler");
		System.out.println("-dev: Himesh Chopra");
		System.out.println("Press \"l or L\" to add a file.");
		System.out.println("Press \"d or D\" for further details");
	}
	//get the key pressed quit if first character pressed is 'q'
	public char get_user_inp() {
		Scanner sc= new Scanner(System.in);
		char chr=sc.next().replaceAll("\\s", "").charAt(0);
		return chr;
	}

}

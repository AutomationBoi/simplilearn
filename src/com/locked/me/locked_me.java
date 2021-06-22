package com.locked.me;

public class locked_me {
	static locked_me_helperfunctions help_obj=new locked_me_helperfunctions();
	static char user_inp='p';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (user_inp!='q') {
		help_obj.welcome_screen();
		user_inp=help_obj.get_user_inp();
		//Use to list files
		if(user_inp=='l'||user_inp=='L') {
			System.out.println("List of files present in directory:\n"+help_obj.get_file_names());
			System.out.println("*************************************************");
		}
		//*******************************
		
		//To display details
		if(user_inp=='d'||user_inp=='D') {
			System.out.flush();  //flush existing stuff on console.
			help_obj.further_details();
			System.out.println("*************************************************");
			user_inp=help_obj.get_user_inp();
		}
		}
	}

}

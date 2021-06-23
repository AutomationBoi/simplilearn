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
			help_obj.get_file_names();
			System.out.println("*************************************************");
		}
		//*******************************
		
		//To display details
		if(user_inp=='d'||user_inp=='D') {
			System.out.flush();  //flush existing stuff on console.
			help_obj.further_details();
			System.out.println("*************************************************");
			user_inp=help_obj.get_user_inp();
			if(user_inp=='a'||user_inp=='A') {
				System.out.println("Please Enter the File name to be added.");
				String filename=help_obj.get_user_file_name();
				help_obj.add_file(filename);
				System.out.println("*************************************************");
			}
			if(user_inp=='r'||user_inp=='R') {
				System.out.println("Please Enter the File name to be Removed.");
				String filename=help_obj.get_user_file_name();
				help_obj.remove_file(filename);
				System.out.println("*************************************************");
			}
			if(user_inp=='s'||user_inp=='S') {
				System.out.println("Please Enter the File name to be searched.");
				String filename=help_obj.get_user_file_name();
				help_obj.search_file(filename);
				System.out.println("*************************************************");
			}
		}
		}
		System.out.println("Program Succesfully exited.");
	}

}

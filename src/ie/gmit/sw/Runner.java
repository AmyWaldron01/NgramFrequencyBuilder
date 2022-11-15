package ie.gmit.sw;

import java.util.Scanner;

public class Runner {
	
	//Private Variables
	private static long nSize;
	private static String fileName;
	private static String dir;
	
	//insatance of menu
	private static menu menu1= new menu();
	
	public static void main(String[] args) throws Exception {
		
		//varibles
		int selection=0;
		
		//instance of the menu
		menu.menuOptions();
		
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		while(selection !=5) {
			selection = scanner.nextInt();
			
			//Do something....
			//It will what number options you pick
			
			switch(selection) 
			{
				case 1:
					//Parser.parse("./books");
					textFileDir();
					break;
					
				case 2:
					findSize();
					break;
					
				case 3:
					fileName();
					break;
					
				case 4:
					Parser.parse(dir);
					break;
					
				case 5:
					System.exit(0);
					break;
					
				default:
					break;
			
			}
			
			
		}
		
		processMeter pm = new processMeter();
		pm.main();
	}
	
	//option 2
	//Finidng n Gram size
	public static void findSize()
	{
		//varibles for the do while
		boolean error;
		
		do {
			error = false;
					
			//Ask user size of the n-Gram
			System.out.println("Please Enter the Size of the N-Gram between 1-5");
			Scanner scanner = new Scanner(System.in);
			
			//Assigning the value to varible
			nSize = scanner.nextLong();
			
			if(nSize >5 || nSize <1)
			{
				System.out.println("101 ERROR!! Wrong number entered");
				error=true;
				
			}	
			
		}while(error == true); 
		
		//back to menu
				System.out.println("Complete. Back to Menu!");
				menu.menuOptions();
		
		
	}
	
	//Sending size to parser
	public static long getSize()
	{
		return nSize;
	}
	
	
	//option 3
	//Asking the user for CSV File directory and File Name
	public static void fileName()
	{
		//ask user to enter file name
		System.out.println("Please Enter the File Name");
		Scanner scanner = new Scanner(System.in);
		
		//assign to varible
		fileName = scanner.next();
		
		//ask the user where they want to store the file
		System.out.println("Please Enter a directory for your file or 1 by default");
		
		
		//Assigning the varible
		dir = scanner.next();
		
		//back to menu
				System.out.println("Complete. Back to Menu!");
				menu.menuOptions();
		
	}
	
	//sending file size to parser
	public static String getFileName()
	{
		return fileName;
	}

	//sending file Dir to parser
	public static String getDir()
	{
		return dir;
	}
	
	//change name
	//Geting the Text file Dir
	public static void textFileDir() throws Exception
	{
		//Ask user size of the n-Gram
		System.out.println("Please Enter Directory for the text files ");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		//Assigning the value to varible
		String textFile = scanner.next();
		
		//back to menu
		System.out.println("Complete. Back to Menu!");
		menu.menuOptions();
		
		//sending dir to parser
		Parser.parse(textFile);
		
	}
}
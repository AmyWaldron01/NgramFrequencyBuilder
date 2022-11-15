package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Parser {
	private static Map<String,Long> frequency = new HashMap<>();
	
	public static Map<String, Long> getMap(){
		return Parser.frequency;
	}//end of Map
	
	public static void parse(String dir) throws Exception{
		String[] files= new File(dir).list();
		
		//For every file
		for(String f : files) {
			//make file have a directory
			String usingFile = dir+""+f;
			
			
			//Sends the file to process
			process(usingFile);
			
		}
		
	}//end of parse
	
	
	
	public static void process(String file) throws Exception{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
			String line  = null;
			long result = 0;
			long nGram=0;
			
			//Loop thought each line is this text file
			while((line = br.readLine()) !=null) {
				line = line.trim().replaceAll("[^a-zA-Z]","").toLowerCase();
				
				//Word one = new Word(line);
				//String [] words = line.toLowerCase().trim().split(" ");
				String [] words = line.toLowerCase().split(" ");
				
				nGram = Runner.getSize();
							
				
				//A-z or a-z
				
				
				for(String word : words) {		
					char[] w =word.toCharArray();//word.charAt(i);	
					List<Character>letters = new ArrayList<Character>();
					
					for (int i = 0; i < w.length; i++) {//Loop over word and extract n-gram
						//if the word is the same
						 
						char let1 = w[i];
						letters.add(let1);
					
						
						if(letters.size() == nGram)
						{
							//Making object of StringBuilder class
							StringBuilder sb1 = new StringBuilder();
							
							//Adding to characters one by one
							for(Character c1 : letters)
							{
								sb1.append(c1);
							}
							
							//Seeing if NGram is already present in the Frequency
							if(frequency.containsKey(sb1.toString()))
							{
								result = frequency.get(sb1.toString());
								result++;
							}
							
							//Adding each word to hash map
							frequency.put(sb1.toString(),result);
							
						}
						
						
						//Resting the value
						result=1;
						
						//testing
						//System.out.println(frequency);
						
					}
					
				}
			
				
			}
		}
		
		output op = new output();
		op.main();
		
}
	
	
}

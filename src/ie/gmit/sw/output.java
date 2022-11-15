package ie.gmit.sw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class output {
	
	static void main() throws Exception
	{
		String fileName , fileDir ,filePath;//chnage name filepatch
		
		fileName=Runner.getFileName();
		fileDir=Runner.getDir();
		
		filePath = fileDir+""+fileName;
		
		output(filePath);
		
		
	}
	
	private static void output(String file) throws Exception
	{
		FileWriter fw = new FileWriter(new File(file));
		Map<String, Long>frequency = new HashMap<>();
		//FileWriter fw = new FileWriter(new File("/.books/HobbitTolkien.txt"));
		
		
		frequency= Parser.getMap();
		
		//looping over and writing
		for(java.util.Map.Entry<String, Long> entry :frequency.entrySet())
		{
			fw.write(entry.getKey()+","+entry.getValue()+"\n");
		}
		
		//Flush
		fw.flush();
		
		//close Writer
		fw.close();

		//ALLL TRIAL AND ERROR----------------------------
		//		//Set<String, Long> kvs = frequency.entrySet();
//		
//		BufferedWriter bf =null;
//		
//		try {
//			//create new bufferwriter for the output file
//			bf= new BufferedWriter(new FileWriter(file));
//		
//		
//			//Loop over entries and write out...
//			for(java.util.Map.Entry<String, Long> entry :frequency.entrySet())
//			{
//				bf.write(entry.getKey()+":"+entry.getValue());
//				
//				bf.write("");
//			}
//		
//			bf.flush();
//		}
//		
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		finally {
//			//closing the writer
//			bf.close();
//		
//		}//end of finally
//		
////		if(file.exists())
////		{
////			System.out.println();
////		}
////		
	
	
		
	
	
	}

	
}

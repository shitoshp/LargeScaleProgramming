import java.io.*;
import java.util.*;

public class PhoneDirectory {
	
	public void addEntry(String name, String number) throws IOException{
		
		Properties my_prop = new Properties();
		OutputStream output = new FileOutputStream("src/main/resources/phone.properties", true);
		
		my_prop.setProperty(name, number);
		
		my_prop.store(output, null);  //store value
		output.close();
	}
	
//	public void deleteEntry(String name){
//		
//	}
//	
//	public String getNumber(String name){
//		
//	}
//	
//	public void changeEntry(String name, String number){
//		
//	}
//	
}


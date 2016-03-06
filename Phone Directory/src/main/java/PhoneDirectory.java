import java.io.*;
import java.util.*;

public class PhoneDirectory {
	
	String get_info;
	
	public void addEntry(String name, String number) throws IOException{
		
		Properties my_prop = new Properties();
		OutputStream output = new FileOutputStream("src/main/resources/phone.properties", true);
		
		my_prop.setProperty(name, number);
		
		my_prop.store(output, null);  //store value
		output.close();
	}
	
	public void deleteEntry(String name) throws IOException{
		
		Properties my_prop = new Properties();
		
		InputStream input = new FileInputStream("src/main/resources/phone.properties");   //deleting
		my_prop.load(input);
		my_prop.remove(name);
		input.close();
		
		OutputStream output = new FileOutputStream("src/main/resources/phone.properties"); //after deletion
		my_prop.store(output, null);
		output.close();
		
	}
//	
	public String getNumber(String name) throws IOException{
		
		Properties my_prop = new Properties();
		InputStream input = new FileInputStream("src/main/resources/phone.properties");
		my_prop.load(input);
		get_info = my_prop.getProperty(name);
		input.close();
		
		System.out.println(get_info);
		return get_info;
		
	}
//	
//	public void changeEntry(String name, String number){
//		
//	}
//	
}


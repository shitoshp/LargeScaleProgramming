import java.io.*;
import java.util.*;

public class PhoneDirectory {
	
	String get_info;      //to return getNumber(name)
	String path;
	
	public PhoneDirectory(String path){
		this.path = path + "phonedir.txt";
		
		
	}
	public void addEntry(String name, String number) throws IOException{
		
		Properties my_prop = new Properties();
		OutputStream output = new FileOutputStream(path, true);
		
		my_prop.setProperty(name, number);
		
		my_prop.store(output, null);  //store value
		output.close();
	}
	
	public void deleteEntry(String name) throws IOException{
		
		Properties my_prop = new Properties();
		
		InputStream input = new FileInputStream(path);   //deleting
		my_prop.load(input);
		my_prop.remove(name);
		input.close();
		
		OutputStream output = new FileOutputStream(path); //after deletion
		my_prop.store(output, null);
		output.close();
		
	}
	
//this lets you input a person's name and get their phone number
	public String getNumber(String name) throws IOException{
		
		Properties my_prop = new Properties();
		InputStream input = new FileInputStream(path);
		my_prop.load(input);
		get_info = my_prop.getProperty(name);
		input.close();
		
		System.out.println(get_info);
		return get_info;
		
	}
	
//this changes the phone number of people	
	public void changeEntry(String name, String number) throws IOException{
		
		Properties my_prop = new Properties();
		
		InputStream input = new FileInputStream("src/main/resources/phone.properties");
		my_prop.load(input);
		my_prop.replace(name, number);
		input.close();
		
		OutputStream output = new FileOutputStream("src/main/resources/phone.properties"); 
		my_prop.store(output, null);
		output.close();
	}
//	
}


import java.io.*;

public class driver {
	
	public static void main(String args[]) throws IOException{
		
		FileInputStream filestream = null;
		BufferedReader reader = null;
		
		filestream = new FileInputStream("Resources/polynomial.txt");
		reader = new BufferedReader(new InputStreamReader(filestream));
		
		String line = reader.readLine();
        while(line != null){
        	String[] array = line.split(";");
        	Polynomial poly_obj = new Polynomial();
        	for (int i = 1; i < array.length; i+=2){
        		int x = Integer.parseInt(array[i]);
        		int y = Integer.parseInt(array[i+1]);
        		poly_obj.insert(x, y);
        	}
        
		String newpoly = poly_obj.get_polynomialString();
		System.out.println(newpoly);
		line = reader.readLine(); 
//		Polynomial poly = new Polynomial();
//		poly_obj.insert(2, 3);
//		poly_obj.insert(4, 6);
//		poly_obj.insert(1, 2);
//		poly_obj.delete(4,6);
		
		
//		poly_obj.reverse();
//		
//		System.out.println(poly_obj.product());
//		String newpoly = poly_obj.get_polynomialString();
//		System.out.println(newpoly);
        }
		
	}

}

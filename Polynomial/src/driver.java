import java.io.*;

public class driver {
	
	public static void main(String args[]) throws IOException{
		
		FileInputStream filestream = null;
		BufferedReader reader = null;
		
		filestream = new FileInputStream("Resources/polynomial.txt");
		reader = new BufferedReader(new InputStreamReader(filestream));
		int p = 0;
		String line = reader.readLine();
        while(line != null){
        	
        	String[] array = line.split(";");
        	Polynomial poly_obj = new Polynomial();           //creating object from polynomial class
        	for (int i = 1; i < array.length; i+=2){
        		int x = Integer.parseInt(array[i]);
        		int y = Integer.parseInt(array[i+1]);
        		poly_obj.insert(x, y);
        	}
        
        poly_obj.reverse();                    //reverse
		String print_poly = poly_obj.get_polynomialString();       //storing polynomial string in variable
		System.out.print("P" + p + "(X) = ");  //polynomial number count
		
		System.out.println(print_poly);
		//System.out.println(poly_obj.product());        //delete
		
		p += 1;
		
		poly_obj.reverse();
		
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

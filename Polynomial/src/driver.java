
public class driver {
	
	public static void main(String args[]){
		
		Polynomial poly = new Polynomial();
		poly.insert(2, 3);
		poly.insert(4, 6);
		String newpoly = poly.get_polynomialString();
		System.out.println(newpoly);
	}

}

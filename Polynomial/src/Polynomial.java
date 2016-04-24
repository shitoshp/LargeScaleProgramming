import java.util.ArrayList;
import java.util.Collections;

public class Polynomial {
	
	private ArrayList<Term> polynomial_list;
	private ArrayList<Term> reverse_polynomial_list;
	private String polynomialString = "";
	
	public Polynomial(){
		polynomial_list = new ArrayList();
	}
		
	public String get_polynomialString(){
		int sign;
		sign = polynomial_list.get(0).getCoefficient();
		String Polynomial_number;
		
		String term1 = polynomial_list.get(0).toString();
		if (polynomial_list.get(0).getExponent() == 0){
			polynomialString += polynomial_list.get(0).getCoefficient() + " ";}
			
		
		for (int i = 1; i < polynomial_list.size(); i++){
			String term = polynomial_list.get(i).toString();
			sign = polynomial_list.get(i).getCoefficient();
			if (polynomial_list.get(i).getExponent() == 0){
				if (sign > 0){
					polynomialString = polynomialString + "+" + polynomial_list.get(i).getCoefficient();
				}
				else {polynomialString += polynomial_list.get(i).getCoefficient();}
				}
			else if(polynomial_list.get(i).getExponent() == 1){
				if (sign > 1) {polynomialString = polynomialString + "+" + polynomial_list.get(i).getCoefficient() + "x ";}
				else {polynomialString += polynomial_list.get(i).getCoefficient() + "x ";}
			}
			else{
				if (sign > 1) {polynomialString = polynomialString + "+" + term;}
				else {polynomialString += term;}
			}
		}
		return polynomialString;
	}
	
	public void insert(int x, int y){
		Term insert_term = new Term(x, y);
		if (polynomial_list.isEmpty()) {
			//System.out.println("IsEmpty");
			polynomial_list.add(insert_term);
		}
		else{
			//System.out.println(polynomial_list.size());
			int size = polynomial_list.size();
			boolean added = false;
			for (int i = 0; i < size; i++){
				
				//System.out.println(i);
				if (polynomial_list.get(i).getExponent() > insert_term.getExponent()){
					polynomial_list.add((i), insert_term);
					added = true;
					break;
				}
				
				
			}
			if (added == false){
				polynomial_list.add(insert_term);
				added = true;
			}
			
		}
		//System.out.println(polynomial_list.size());

	}
	
	public void delete(int x, int y){
		//System.out.println("deleting term");
		boolean removed = false;
		Term delete_term = new Term(x, y);
		//System.out.println(polynomial_list.size());
		for (int i = 0; i < polynomial_list.size(); i++){
			//System.out.println("1deleting term");
			Term term = polynomial_list.get(i);
			if (term.equals(delete_term)){
				//System.out.println("deleting term");
				polynomial_list.remove(term);
				removed = true;
			};
		if (removed == false){
			System.out.println("Delete content not found.");
		}
		}
	}
	
	public void reverse(){
		Collections.reverse(polynomial_list);
		System.out.println("reversing");
	}
	
	public String product(){
		int c_product = 1;
		int e_sum = 0;
		for (int i = 0; i < polynomial_list.size(); i++){
			int c = polynomial_list.get(i).getCoefficient();
			int e = polynomial_list.get(i).getExponent();
			c_product = c_product * c;
			e_sum = e_sum + e;
		}
		Term product_term = new Term(c_product, e_sum);
		return product_term.toString();
	}
}

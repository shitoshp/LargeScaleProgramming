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
		for (int i = 0; i < polynomial_list.size(); i++){
			String term = polynomial_list.get(i).toString();
			polynomialString += term;
		}
		return polynomialString;
	}
	
	public void insert(int x, int y){
		Term insert_term = new Term(x, y);
		polynomial_list.add(insert_term);
	}
	
	public void delete(int x, int y){
		Term delete_term = new Term(x, y);

		for (int i = 0; i < polynomial_list.size(); i++){
			Term term = polynomial_list.get(i);
			if (term.equals(delete_term)){
				System.out.println("deleting term");
				polynomial_list.remove(term);
			};
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
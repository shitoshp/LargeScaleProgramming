import java.util.ArrayList;

public class Polynomial {
	
	private ArrayList<Term> polynomial_list;
	private String polynomialString = "";
	
	public Polynomial(){
		polynomial_list = new ArrayList();
	}
	
	public void insert(int x, int y){
		Term insert_term = new Term(x, y);
		polynomial_list.add(insert_term);
	}
	

	
	public String get_polynomialString(){
		for (int i = 0; i < polynomial_list.size(); i++){
			String term = polynomial_list.get(i).toString();
			polynomialString += term;
		}
		return polynomialString;
	}
}

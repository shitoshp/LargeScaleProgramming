
public class Term {
	/**
	 * variables for coefficient, exponent and ArrayList
	 */
	private int coefficient;
	private int exponent;
	private String termString;
	/**
	 * This constructor creates a term object with a coefficient and exponent passed as parameters
	 * @param coefficient = coefficient of term
	 * @param exponent = exponent of term
	 */
	public Term(int coefficient, int exponent){
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	
	/**
	 * get functions for getting coefficient and exponent
	 * @return
	 */
	public int getCoefficient(){
		return coefficient;
	}
	
	public int getExponent(){
		return exponent;
	}
	
	/**
	 * method to return a string for term
	 */
	public String toString(){
		termString = String.valueOf(coefficient) + "x^" + String.valueOf(exponent) + " ";   
		return termString;
	}
	
	/**
	 * equals method which takes a term to compare if it is equal to the term here
	 * @param compare_term
	 * @return
	 */
	public boolean equals(Term compare_term){
		if (compare_term == null) {return false;}
		else if (compare_term == this) {return false;}
		else if ((compare_term.exponent == this.exponent) && (compare_term.coefficient == this.coefficient)){return true;}
		else {return false;}
	}
}

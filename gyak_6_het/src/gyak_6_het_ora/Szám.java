package gyak_6_het_ora;

public class Szám {
	
	static double errorBorder= 0.001;
	protected double number;
	
	public Szám() {
		
	}
	
	
	public Szám(double d){
		number=d;
		return;

	}
	


	public boolean inErrorBorder(double num) {
		double statement=this.number-num;
		if(statement<errorBorder && statement>-0.001) {
			return true;
		}
		return false;
	}
	
	public void setNumber(double num) {
		this.number=num;
	}


	public double getNumber() {
		return number;
	}

}

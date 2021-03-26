package myproducts;

public class Bread extends Product {

	
	float amount;
	
	public Bread(String nm, int prc, int vtky, float mnt) {
		super(nm, prc, vtky);
		this.amount=mnt;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"  "+ this.amount;
	}
	
	public float getAmount() {
		return this.amount;
	}
	
	public boolean biggerPrice( Bread b) {
		float multiplier=1/this.amount;
		if(this.bruttoPrice()*multiplier > b.bruttoPrice()*multiplier) {
			return true;
		}else return false;
		
	}
	

}

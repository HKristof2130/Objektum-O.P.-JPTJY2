package myproducts;

public class Product {

	String name;
	int price;
	int vatKey;
	
	public Product() {
		
	}
	
	public Product(String nm, int prc, int vtky) {
		this.name=nm;
		this.price=prc;
		this.vatKey=vtky;
	}
	 public float bruttoPrice() {
		 float tmp=(float)price+ (float)vatKey;
		 return Math.round((float)price+tmp);
	 }
	@Override
	public String toString() {

		return this.name+"  "+this.price+"  "+this.vatKey;
	}
	
	public float incPrice(int percentage) {
		
		float tmp= ((float)percentage/100)+1;
		return (float)this.price*tmp;
		
	}
	
	public int moreExpensive(Product p) {
		
		if(this.bruttoPrice() > p.bruttoPrice()) {
			return 1;
		}else if(this.bruttoPrice() < p.bruttoPrice()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	 
	 
	 
}

package gyak_7het;

public class Product {
	
	private String name;
	private int netPrice;
	private int vatPercent;
	
	public Product(String name, int nprice, int vatp) {
		this.name=name;
		this.netPrice=nprice;
		this.vatPercent=vatp;
	}

	public int getGrossPrice() {
		float vat=(float)netPrice+ (float)vatPercent;
		return Math.round((float)netPrice+vat);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name" + " - "+ getGrossPrice();
	}
	
	public void incrasePriceByPercent(int percent) {
		
		netPrice+= Math.round((float)netPrice*(float)percent);
	}
	
	public static int comparePrice(Product prodA, Product prodB) {
		
		int diff=prodA.getGrossPrice() - prodB.getGrossPrice();
		if(diff > 0) {
			return 1;
		}else if(diff < 0) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}

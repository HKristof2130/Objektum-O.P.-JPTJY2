package gyak_7het;

public class Bread extends Product {
	private float amount;

	public Bread(String name, int netPrice, int vatPercent, float amount) {
		super(name,netPrice,vatPercent);
		this.amount= amount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " - "+ Math.round((float)getGrossPrice()/(float)amount);
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	 public int unitPrice() {
		 return Math.round((float)getGrossPrice()/(float)amount);
	 }
	 
	 
	
}

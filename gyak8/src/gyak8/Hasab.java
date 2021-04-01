package gyak8;

public abstract class Hasab {

	private int magassag;
	
	public Hasab(int magassag) {
		super();
		this.magassag=magassag;
	}

	public int getMagassag() {
		return magassag;
	}
	
	public abstract float getAlapterulet();
	
	public abstract float getTerfogat();
	
	public boolean osszehasonlit( Hasab masik) {
		
		return this.getTerfogat()> masik.getTerfogat();
		
	}
	
	
}

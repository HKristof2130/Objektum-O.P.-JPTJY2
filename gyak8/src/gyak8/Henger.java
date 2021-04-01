package gyak8;

public class Henger extends Hasab {

	private float sugar;
	
	public Henger(int magassag, float sugar) {
		super(magassag);
		this.sugar=sugar;
	}
	
	@Override
	public float getAlapterulet() {
		// TODO Auto-generated method stub
		return sugar*sugar*(float)Math.PI;
	}
	
	@Override
	public float getTerfogat() {

		return getAlapterulet()* getMagassag();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Float.toString(sugar)+" "+getMagassag()+" "+getTerfogat;
	}
	

	
}

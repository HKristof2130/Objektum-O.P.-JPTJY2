package hazi;

public class Books {

	public static void main(String[] args) {
		
		
		Book b1=new Book();
		System.out.println("Adja meg a k�nyv c�m�t!");
		b1.setTitle();
		System.out.println("Adja meg a k�nyv szerz�j�t!");
		b1.setAuthor();
		System.out.println("Adja meg a k�nyv megjelen�si d�tum�t!");
		b1.setDate();
		System.out.println("Adja meg a k�nyv �r�t!");
		b1.setPrice();
		System.out.println(b1.priceUp(10));
		System.out.println(b1.getTitle()+b1.getAuthor()+b1.getDate()+b1.getPrice());
		
	
	}

}

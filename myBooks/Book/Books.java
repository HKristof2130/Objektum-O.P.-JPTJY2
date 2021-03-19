package hazi;

public class Books {

	public static void main(String[] args) {
		
		
		Book b1=new Book();
		System.out.println("Adja meg a könyv címét!");
		b1.setTitle();
		System.out.println("Adja meg a könyv szerzõjét!");
		b1.setAuthor();
		System.out.println("Adja meg a könyv megjelenési dátumát!");
		b1.setDate();
		System.out.println("Adja meg a könyv árát!");
		b1.setPrice();
		System.out.println(b1.priceUp(10));
		System.out.println(b1.getTitle()+b1.getAuthor()+b1.getDate()+b1.getPrice());
		
	
	}

}

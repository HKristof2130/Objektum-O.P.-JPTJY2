package myproducts;

public class main_product {

	public static void main(String[] args) {
		Product product1= new Product("Laptop",350000,27);
		Bread bread1= new Bread("Fehér",150,27,1.0f);
		System.out.println(product1);
		System.out.println(bread1);
		System.out.println(product1.moreExpensive(bread1));
		
	}

}

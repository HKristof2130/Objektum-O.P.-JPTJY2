package gyak_6_het_ora;

import java.util.Random;

public class Main_Sz�m {

	public static void main(String[] args) {

	final Sz�m n1= new Sz�m(0.23);
	generateRightNumber(n1);
		
	}
	
	public static void generateRightNumber(Sz�m n) {
		Random rand= new Random();
		double randomNum;
		int i=1;
		do {
			randomNum=rand.nextDouble();
			if(randomNum== n.getNumber()) {
				System.out.printf("Megtal�ltam %d prob�lkoz�sra a %lf sz�mot\n",i,randomNum);
				break;
			}
			System.out.println(randomNum);
		}while(i<1);
	}
	

}

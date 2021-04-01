package gyak_6_het_ora;

import java.util.Random;

public class Main_Szám {

	public static void main(String[] args) {

	final Szám n1= new Szám(0.23);
	generateRightNumber(n1);
		
	}
	
	public static void generateRightNumber(Szám n) {
		Random rand= new Random();
		double randomNum;
		int i=1;
		do {
			randomNum=rand.nextDouble();
			if(randomNum== n.getNumber()) {
				System.out.printf("Megtaláltam %d probálkozásra a %lf számot\n",i,randomNum);
				break;
			}
			System.out.println(randomNum);
		}while(i<1);
	}
	

}

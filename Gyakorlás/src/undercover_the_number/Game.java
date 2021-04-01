package undercover_the_number;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		System.out.println("Gondoltam egy sz�mra 1 �s 100 k�z�tt!");
		int tries=0;
		int number;
		boolean found=false;
		number= (int)(Math.random()*100+1);
		int answer;
		Scanner scan = new Scanner(System.in);
 		int prediction;
		while(found != true) {
		System.out.println("mit szeretn�l k�rdezni?");
		System.out.println("0: A sz�m p�ros? 1: Tippelek egy sz�mra!");
		answer=scan.nextInt();
		if(answer == 0) {
			if(number % 2== 0) {
				System.out.println("A sz�m p�ros");
			}else System.out.println("A sz�m p�ratlan");
			tries++;
		}else if(answer == 1) {
			System.out.println("Melyik sz�mra gondolt�l?");
			prediction=scan.nextInt();
			if(number > prediction) {
				System.out.println("Igen a sz�m nagyobb mint amire gondolt�l");
			}else if(number == prediction) {
				System.out.println("Kital�ltad a sz�mot!");
				found=true;
			}else System.out.println("A sz�m kisebb mint amire gondolt�l");
			tries++;
		}else {
			System.out.println("Nem megfelel� v�laszt adt�l!");	
			}
		}
		System.out.println("Gratul�lok, nyert�l!");
		System.out.printf("Csak %d k�s�rletre volt sz�ks�ged :D",tries);
		scan.close();
   }
}
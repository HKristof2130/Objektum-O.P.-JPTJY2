package undercover_the_number;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		System.out.println("Gondoltam egy számra 1 és 100 között!");
		int tries=0;
		int number;
		boolean found=false;
		number= (int)(Math.random()*100+1);
		int answer;
		Scanner scan = new Scanner(System.in);
 		int prediction;
		while(found != true) {
		System.out.println("mit szeretnél kérdezni?");
		System.out.println("0: A szám páros? 1: Tippelek egy számra!");
		answer=scan.nextInt();
		if(answer == 0) {
			if(number % 2== 0) {
				System.out.println("A szám páros");
			}else System.out.println("A szám páratlan");
			tries++;
		}else if(answer == 1) {
			System.out.println("Melyik számra gondoltál?");
			prediction=scan.nextInt();
			if(number > prediction) {
				System.out.println("Igen a szám nagyobb mint amire gondoltál");
			}else if(number == prediction) {
				System.out.println("Kitaláltad a számot!");
				found=true;
			}else System.out.println("A szám kisebb mint amire gondoltál");
			tries++;
		}else {
			System.out.println("Nem megfelelõ választ adtál!");	
			}
		}
		System.out.println("Gratulálok, nyertél!");
		System.out.printf("Csak %d kísérletre volt szükséged :D",tries);
		scan.close();
   }
}
package gyak_6_het_ora;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
  
		System.out.println("Mennyi alkalmazotatt szeretne felvezetni?");
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		Employee workers[]= new Employee[n];
		for(int i=0;i<n;i++) {
			workers[i]= new Employee();
			System.out.println("Adja meg az alkalmazott nevét!");
			workers[i].name= scan.next();
			System.out.println("Adja meg az életkorát!");
			workers[i].setAge(scan.nextInt());
			System.out.println("Adja meg a fizetését!");
			workers[i].setSalary(scan.nextInt());
		}
		
		changeAgeLimit(workers);
		lessThanFive(workers);
		lessThanAvrg(workers);
		
		minChooseSort(workers);
		displayEmployees(workers);
		maxChooseSort(workers);
		displayEmployees(workers);
		
		scan.close();
	}
	
	public static void lessThanFive(Employee[] workers) {
		// értéken belüli nyudíjok kiirása
		System.out.println("5 évnél kevesebb munka a nyugdíjig");
		int temp;
		for( Employee emp: workers) {
					temp=emp.untilRest();
					if(temp<5) {
						System.out.println(emp.toString()); 
					}
				}
		System.out.printf("\n \n");
	}
	
	public static void changeAgeLimit(Employee[] workers) {
		// Adatok kiirasa, modositasa, kiirasa
		Scanner scan=new Scanner(System.in);
				for( Employee emp: workers) {
					System.out.println(emp.toString());
					
				}
				
				System.out.println("Módosítsa a nyugdíj korhatárokat!");
				int temp;
				System.out.printf("Az új nyugdíj korhatár: ");
				temp=scan.nextInt();
				for( Employee emp: workers) {
					emp.setAgeLimit(temp);
				}
				for( Employee emp: workers) {
					System.out.println(emp.toString());
				}
				scan.close();
				System.out.printf("\n \n");

	}
	
	
	public static void lessThanAvrg(Employee[] workers) {
		
		//Írja ki azoknak az alkalmazottaknak az adatait, akiknek az átlagnál több éve van még hátra nyugdíjig.
		 int avrgTimeRemain=0;
		for( Employee emp: workers) {
			avrgTimeRemain=emp.untilRest();
		}
		
		System.out.println("Akiknek kevesebb munka van hátra mint az átlag:");
		for( Employee emp: workers) {
			if( emp.untilRest()<avrgTimeRemain) {
				System.out.println(emp.toString());
			}
		}
		System.out.printf("\n \n");

	}
	
	public static void minChooseSort(Employee[] workers) {
		int minIndex;
		Employee tmp;
		for(int i=0;i<workers.length-1;i++) {
			minIndex= i;
			for(int j=i+1;j<workers.length;j++) {
				if(workers[j].untilRest() < workers[minIndex].untilRest()) {
				minIndex=j;	
				}
			}
			if(minIndex !=i) {
				tmp=workers[i];
				workers[i]=workers[minIndex];
				workers[minIndex]= tmp;
		}
	}
}
	
	public static void maxChooseSort(Employee[] workers) {
		int maxIndex;
		Employee tmp;
		for(int i=0;i<workers.length-1;i++) {
			maxIndex= i;
			for(int j=i+1;j<workers.length;j++) {
				if(workers[j].untilRest()>workers[maxIndex].untilRest()) {
				maxIndex=j;	
				}
			}
			if(maxIndex !=i) {
				tmp=workers[i];
				workers[i]=workers[maxIndex];
				workers[maxIndex]= tmp;
		}
	}
}

	public static void displayEmployees(Employee[] workers) {
		for(Employee emp: workers) {
			System.out.println(emp.toString());
		}
		System.out.printf("\n \n");
	}
	

	
	
}

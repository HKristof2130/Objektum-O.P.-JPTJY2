package random_sentence_generator;

import java.util.Scanner;

public class Main_r_sentence {

	public static void main(String[] args) {
		int switcher;
		Words words1= new Words();
		generateRandomSentence(words1);
		System.out.println("Szeretne saját szavakkal dolgozni?");
		System.out.println("0: nem   1: igen");
		Scanner scan = new Scanner(System.in);
		switcher=scan.nextInt();
		if(switcher==1) {
			int n;
			System.out.println("Az elso kupacba mennyi szót szeretne megadni?");
			n=scan.nextInt();
			words1.newWord1= new String[n];
			for(int i=0;i<words1.newWord1.length;i++) {
				System.out.printf("Adja meg a kupac %d szavát: ",i+1);
				words1.newWord1[i]=scan.next();
			}
			System.out.println("A második kupacba mennyi szót szeretne megadni?");
			n=scan.nextInt();
			words1.newWord2= new String[n];
			for(int i=0;i<words1.newWord2.length;i++) {
				System.out.printf("Adja meg a kupac %d szavát: ",i+1);
				words1.newWord2[i]=scan.next();
			}
			System.out.println("A harmadik kupacba mennyi szót szeretne megadni?");
			n=scan.nextInt();
			words1.newWord3= new String[n];
			for(int i=0;i<words1.newWord3.length;i++) {
				System.out.printf("Adja meg a kupac %d szavát: ",i+1);
				words1.newWord3[i]=scan.next();
			}
			boolean gameEnd= false;
			while(gameEnd != true) {
				generateUsersSentences(words1);
				System.out.println("Befejezed a játékot?");
				System.out.println("Írj true-t ha igen");
				gameEnd=scan.nextBoolean();
				}
		}else {
			System.out.println("Sajnálom hogy nem akarsz játszani :(");
		}
		scan.close();
		
	}
	
	public static void generateRandomSentence( Words w) {
		int random1= (int)(Math.random()*w.basicWord1.length);
		int random2= (int)(Math.random()*w.basicWord2.length);
		int random3= (int)(Math.random()*w.basicWord3.length);
		System.out.println("A random mondat:");
		System.out.println(w.basicWord1[random1]+" "+ w.basicWord2[random2]+" "+w.basicWord3[random3]);
	}
	
	public static void generateUsersSentences(Words w) {
		int random1= (int)(Math.random()*w.newWord1.length);
		int random2= (int)(Math.random()*w.newWord2.length);
		int random3= (int)(Math.random()*w.newWord3.length);
		System.out.println("A random mondat:");
		System.out.println(w.newWord1[random1]+" "+ w.newWord2[random2]+" "+w.newWord3[random3]);
		}
		
	}



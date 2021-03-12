package hazi;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	int date;
	float price;

static Scanner scan= new Scanner(System.in);

public float priceUp(float volume) {
	return this.price*((volume/100)+1);
	
}

public String stringConnect() {
	return "Title: "+this.title+"Author: "+ this.author+"Coming out: "+ this.date+"Price: "+ this.price;
}


public String getTitle() {
	return this.title;
}

public String getAuthor() {
	return this.author;
}

public int getDate() {
	return this.date;
}

public float getPrice() {
	return this.price;
}

public void setTitle() {
	this.title=scan.next();
}

public void setAuthor() {
	this.author=scan.next();
}

public void setDate() {
	this.date= scan.nextInt();
}

public void setPrice() {
	this.price=scan.nextFloat();
}

}
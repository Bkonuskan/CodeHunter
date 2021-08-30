package sp2;

import java.util.Scanner;

public class Deneme2 {

	public static void main(String[] args) {

	  
	       
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Lütfen karaenin iki kenar uzunluğunu giriniz");

	    int sayi1= scan.nextInt();
	    int sayi2= scan.nextInt();

	    System.out.println("Alan : "+ (sayi1*sayi2));
	    System.out.println("Çevre : "+ (2*(sayi1+sayi2)));

	}

}

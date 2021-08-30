package replit_cozumleri;

import java.util.Scanner;

public class Sc2 {

	public static void main(String[] args) {
		/*Kullanıcıdan karenin kenar uzunluğunu alın 
		 * ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
		  */
		
		Scanner scan = new Scanner( System.in ) ;
	    System.out.println("Lütfen Karenin bir kenarını tam sayı olarak giriniz");

	    int sayi1= scan.nextInt();
	    

	    System.out.println("Karenin çevresi : "+ (4*sayi1));
	    System.out.println("Karenin alanını : " + (sayi1*sayi1));
	    scan.close();

	}

}

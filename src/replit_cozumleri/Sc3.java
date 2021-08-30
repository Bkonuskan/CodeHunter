package replit_cozumleri;

import java.util.Scanner;

public class Sc3 {

	public static void main(String[] args) {
		/*Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve 
		 * dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
			Örnek Çıktı:			Alan: 32			Çevre: 24*/
		
		Scanner scan = new Scanner( System.in ) ;
	    System.out.println("Lütfen iki tam sayı giriniz");

	    int sayi1= scan.nextInt();
	    int sayi2= scan.nextInt();

	    System.out.println("Dikdörtgenin çevresi : "+ (2*(sayi1+sayi2)));
	    System.out.println("Dikdörtgenin alanını : " + (sayi1*sayi2));
	    scan.close();
	}

}

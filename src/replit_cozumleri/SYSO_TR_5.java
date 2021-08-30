package replit_cozumleri;

import java.util.Scanner;

public class SYSO_TR_5 {

	public static void main(String[] args) {
		/*Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz 
		 */
		Scanner scan = new Scanner( System.in ) ;
	    System.out.println("Lütfen iki tam sayı giriniz");

	    int sayi1= scan.nextInt();
	    int sayi2= scan.nextInt();

	    System.out.println("Dikdörtgenin çevresi : "+ (2*(sayi1+sayi2)));
	    System.out.println("Dikdörtgenin alanını : " + (sayi1*sayi2));
	    scan.close();

	}

}

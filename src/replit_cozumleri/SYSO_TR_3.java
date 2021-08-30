package replit_cozumleri;

import java.util.Scanner;

public class SYSO_TR_3 {

	public static void main(String[] args) {
		/*Verilen integer sayilarin Toplamini, carpimini, 
		 * cikarma islemini ve bolme islemini yapan java kodunu yaziniz. 
		 */
		Scanner scan = new Scanner( System.in ) ;
	    System.out.println("Lütfen iki tam sayı giriniz");

	    double sayi1= scan.nextDouble();
	    double sayi2= scan.nextDouble();

	    System.out.println("iki sayının Toplamı : "+ (sayi1+sayi2));
	    System.out.println("iki sayının çarpımı : "+ (sayi1*sayi2));
	    System.out.println("iki sayının Çıkarımı : "+ (sayi1-sayi2));
	    System.out.println("iki sayının Bölümü : " + (sayi1/sayi2));
	    scan.close();
	}

}

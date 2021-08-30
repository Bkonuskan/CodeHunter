package replit_cozumleri;

import java.util.Scanner;

public class SYSO_TR_4 {

	public static void main(String[] args) {
		/*Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.		 * 
		 */
		Scanner scan = new Scanner( System.in ) ;
	    System.out.println("Lütfen dairenin yarı çapını giriniz");

	    int r= scan.nextInt();
	     

	    System.out.println("Dairenin çevresi : " + (2*3.14*r));
	    System.out.println("Dairenin alanını : " + (3.14*r*r));
	    scan.close();

	}

}

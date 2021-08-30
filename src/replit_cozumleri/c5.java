package replit_cozumleri;

import java.util.Scanner;

public class c5 {

	public static void main(String[] args) {
		/*Kullanıcıya günde ne kadar çay içtiğini 
		 * ve ne kadar şeker kullandığını sorun. 
		 * Yılda kaç gr şeker kullandığını hesaplayın ve yazdırın.
		 * 1 şeker = 1.7 gr
		 * *   		 */
		Scanner scan = new Scanner( System.in ) ;
	    
	      System.out.println("Günde kaç bardak çay içiyorsunuz : ");

		    int cay= scan.nextInt();
	      System.out.println("Çayı kaç şekerli içiyorsunuz : ");

		    int seker = scan.nextInt();

		    System.out.println("Yılda kullandığınız Şeker miktarı : "+ (cay*seker*365) +"gr");
		     
		    scan.close();
	}

}

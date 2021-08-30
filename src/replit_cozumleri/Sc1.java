package replit_cozumleri;

import java.util.Scanner;

public class Sc1 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir sayı alın 
		 * ve sayının küpünün yarısını 
		 * konsola yazdıran bir program yazın.  
		 */
		
		Scanner scan = new Scanner( System.in ) ;
	    System.out.println("Lütfen bir tam sayı giriniz");
	    double sayi1= scan.nextDouble();
	    
	    System.out.println("Girdiğiniz sayının küpünün yarısı : "
	    		+ (sayi1*sayi1*sayi1/2));
		scan.close();
	}
	
}

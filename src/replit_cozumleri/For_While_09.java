package replit_cozumleri;

import java.util.Scanner;

public class For_While_09 {

	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir sayı giriniz ");
		
		int sayi = scan.nextInt();	        
	        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
	        while(sayi > 0) {	            
	            System.out.print(sayi % 10);
	            sayi /= 10;
	        }

	}

}

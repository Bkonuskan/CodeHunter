package replit_cozumleri;

import java.util.Scanner;

public class For_While_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktoriyeli alinacak sayiyi giriniz");
		int sayi = scan.nextInt();
		
		int sonuc =1;
		String duzen ="";
		for (int i =sayi ; i > 1; i--) {
			sonuc*= i; 
			duzen += i+"*";
		}
	
		System.out.println(sayi + "!=" +duzen +"1=" + sonuc);


	}

}

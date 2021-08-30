package replit_cozumleri;

import java.util.Scanner;

public class For_Wihile_8yedek {

	public static void main(String[] args) {
		/*Kullanıcıdan istemeli yöntem!!!!!		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("***Bu Program  ASCII değerlerini harf karşılığı ile verir***");
		System.out.println("Lütfen 1. Karekteri giriniz");
		char c1=sc.nextLine().charAt(0);
		System.out.println("Lütfen 2. Karekteri giriniz");
		char c2=sc.nextLine().charAt(0);
		
		
		for(int i=(char)c1;i<=(char)c2;i++)	{
		for(char j=c1;j<=c2;j++)		{
		if(i==j)		{
		System.out.println("ASCII value of "+j+" = "+i);
		}
		}
		}

	}

}

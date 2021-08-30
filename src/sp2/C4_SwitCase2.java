package sp2;

import java.util.Scanner;

public class C4_SwitCase2 {

	public static void main(String[] args) {
		// Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
		//Kullanici S girerse “Software”
		//D girerse “Developer”
		//E girerse “Engineer”
		//T girerse “In Testing” yazdirin
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen SDET kisaltmasindaki harflerden birini giriniz :");
		
		char sdet=scan.next().toLowerCase().charAt(0);
		
		switch (sdet) {
		
		case 's':
			System.out.println("Software");
			break;
		case 'd':
			System.out.println("Developer");
			break;
		case 'e':
			System.out.println("Engineer");
			break;
		case 't':
			System.out.println("In Testing");
			break;
			
			default :
				System.out.println("Lütfen geçerli bir harf giriniz");
				
				
		
		
		
		
		}
		
		
		scan.close();
		

	}

}

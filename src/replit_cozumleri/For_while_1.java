package replit_cozumleri;

import java.util.Scanner;

public class For_while_1 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
		 *  ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 /  char ch1= 'a' ;
         	String name =“John came late" 
        	Expected Output: 
            Number of a = 2 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String name=scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bulmak isteğiniz karakteri giriniz");
		char harf=scan.next().toLowerCase().charAt(0);
		int count=0;
		
		for (int i = 0; i < name.length(); i++) {
			
			if(name.charAt(i)==harf) {
				count++;
			}
			
		}
		
		System.out.println("Girdiğiniz Harf "+harf+ " =" + count+ " kere tekrar edilmiştir");
	}

}

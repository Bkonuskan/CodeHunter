package replit_cozumleri;

import java.util.Scanner;

public class For_while_7 {

	public static void main(String[] args) {
		/*Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
          Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, 
          herhangi bir sayı Mükemmel Sayı olarak bilinir.
          Input :
          6
         Output:
          6 Mukemmel Sayidir.

           ======================
		Input
		7
		Output:7  Mukemmel Sayidir degildir.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz");
		
		int num=scan.nextInt();
		int total=0;
		
		for (int i = 1; i <num; i++) {
			if(num%i==0) {
				total+=i;
			}
			
		}if (total==num) {
			System.out.println("Girdiğiniz sayı Mükemmel sayıdır");
		}else System.out.println("Mükemmel sayı değildir");
		
		
		
		

	}

}

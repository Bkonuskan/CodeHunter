package haluk_Hoca_Tekrar;

import java.util.Scanner;

public class d07_Forloop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Bugün hava oldukca güzel.-> 2
        
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = scan.nextLine();
        int aMiktari=0;
        for (int i = 0; i < str.length(); i++) {
            
            if (str.toLowerCase().charAt(i)=='a') {
                aMiktari++;
                
            }else if (str.toLowerCase().charAt(i)=='c') 
                break;
            
                
            
        } System.out.println("girdiginiz metindeki c karakterine kadar olan a karakter sayisi : "+aMiktari);
       

	}

}

package hHo26072021;

import java.util.Scanner;

public class c08 {

	//belirli bir(kullanıcı girecek)  yükseklikten bir top serbest dusme ile bırakilımaktadir.
    // top serbest bırakıldıktan  sonra sürekli birakildigi yüksekliğin ¾ 75 'İ kadar zeminden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde olay sonlandirilmaktadir.
    // Bu ana kadar topun toplam aldığı yolu ve topun zemine  vurma sayısını bulunuz.
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakilacagi yuksekligi giriniz : ");

        double ilkyukseklik=scan.nextDouble();
        double toplamYol=ilkyukseklik;
        int vurmaSayisi=0;
        
        while(ilkyukseklik>=1) {
        	ilkyukseklik=ilkyukseklik*3/4;
        	toplamYol=toplamYol+ilkyukseklik*2;
        	vurmaSayisi++;
        }
        System.out.println("Topun zemine verma sayisi : " +vurmaSayisi);
        System.out.println("Topun toplam aldığı yol : " +toplamYol);
        
        
	}

}

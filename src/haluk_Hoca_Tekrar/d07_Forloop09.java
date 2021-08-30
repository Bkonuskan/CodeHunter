package haluk_Hoca_Tekrar;

public class d07_Forloop09 {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
             
        int harf = 64;
        for (int satir = 1; satir <=6; satir++) {// satır kontrolu
            for (int sutun = 1; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char)(sutun+harf)+" ");
            }
            System.out.println();
        }
        

	}

}

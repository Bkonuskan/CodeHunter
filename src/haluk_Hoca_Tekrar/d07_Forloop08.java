package haluk_Hoca_Tekrar;

public class d07_Forloop08 {
	
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
        int harf = 65;
        for (int satir = 0; satir < 6; satir++) {// satır kontrolu
            for (int sutun = 0; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char)(satir+harf)+" ");
            }
            System.out.println();
        }
        
    }

}

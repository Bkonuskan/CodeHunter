package codeHunter;

import java.util.Random;
import java.util.Scanner;

public class GuessGame1 {
	/*
	​
	    LetsGuess ()  methodunu oluşturalım.
	    Bu method parametre olarak bir int almalı.
	   Return türü void olsun.
	   Bu method da, doğru sayıyı tahmin edene kadar sayıları tahmin etmeye devam etmelisiniz.
	   Numaranız random sayıdan küçükse "Your number is too low" yazdıralım.
	   Numaranız random sayıdan büyükse "Your number is too high" yazdıralım.
	   Tahmin numaranız  random sayıya eşit olduğunda "You got it !!" yazdıralım
	   Ve execution durdurun.
	   Tahmin girişiminiz maksimum 5'tir.
	   Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"
	   Not:
	    1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
	    2) Bu methodların her ikisi de statik bir method değildir
	     
	*/
	Scanner scan = new Scanner(System.in);//3. adim
 	/*
	    randomGenerator ()  methodunu oluşturalım.
	    Bu method 0 ile 100 arasında random bir sayı oluşturmalı.
	    Bu method random sayıyı return etmelı.
	    Return türü int olmalı
	 */
		public int randomGenerator() {// 1. adim 
			Random random = new Random();
			int sayi = random.nextInt(101);
			
			return sayi;
			
		}
		
		 public void LetsGuess(int tahmin1) {//2/ adim 
			 int asilSayi = randomGenerator();
			
				for (int i = 1; i <=6 ; i++) {
				if(i==6) {
					System.out.println("Anlamadım dostum !!!");
					break;
				}
				System.out.print(" 0 ile 100 arasinda bir sayi tahmin ediniz\n " + i + ". tahmininiz : ");
				int tahmin =scan.nextInt();
				
				if (tahmin<asilSayi) {
					System.out.println("Your number is too low");
				}
				else if (tahmin>asilSayi) {
					System.out.println("Your number is too high");
				}
				else {
					System.out.println("You got it !!!");
					break;
				}
			}
			
		 }}		
			
		 
		
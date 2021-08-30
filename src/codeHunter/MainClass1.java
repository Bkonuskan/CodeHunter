package codeHunter;

public class MainClass1 {

	public static void main(String[] args) {
		 /*
	     In the main method
​
	     First get the random number from the randomGenerator method
​
	     Then call the LetsGuess method . randomGenerator num is parameter of the LetsGuess method
​
	      */
 	    /*
​
	        Main methodunda
​
	     İlk olarak randomGenerator method undan random sayıyı alın
​
	     Sonra LetsGuess method unu çağırın. randomGenerator num LetsGuess method unun parametresidir
​
	     */
		
		GuessGame1 obj = new GuessGame1();//4. adim
		
		obj.LetsGuess(obj.randomGenerator());//5.adim
		
	}

}

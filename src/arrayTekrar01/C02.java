package arrayTekrar01;
import java.util.Arrays;
import java.util.Collections;

public class C02 { 
	 /*String Array i tersten çeviren program*/ 
	 static void reverse(String myArray[]) { 
		 Collections.reverse(Arrays.asList(myArray)); 
		 System.out.println("Reversed Array:" + Arrays.asList(myArray)); }
	 
	 public static void main(String[] args) { 
		 String [] myArray = {"one", "Two", "Three","Four", "Five", "Six","Seven"}; 
		 System.out.println("Original Array:" + Arrays.asList(myArray)); reverse(myArray); } }
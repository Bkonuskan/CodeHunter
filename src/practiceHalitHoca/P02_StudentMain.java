package practiceHalitHoca;

import java.util.Scanner;

public class P02_StudentMain {
	/* TODO
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
    todo  Main classın içinde;
    Örnek:    age 12'dir.
    name Steven'dır.
todo  name(isim) olarak;
    "Student name is Steven"
    ve    age(yaş) olarak da;
    "He is 12 years old"
 */
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Adınızı giriniz");
	String name=scan.nextLine();
	System.out.println("Yaşınızı giriniz");
	int age= scan.nextInt();
	
	P02_Student student1=new P02_Student();
	student1.setName(name);
	student1.setYas(age);
	
	System.out.println("Öğrencinin Adı : "+ student1.getName()+ " ve Yaşı :"+ student1.getYas());

	}

}

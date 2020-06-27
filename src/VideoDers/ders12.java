package VideoDers;

import java.util.Scanner;

public class ders12 {
	
	public static int cikar(int a,int b){
		
		if(a>=b) return a-b; else return b-a;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Bir sayý giriniz : ");
		a = scan.nextInt();
		System.out.println("Bir sayý giriniz : ");
		b = scan.nextInt();
		
		System.out.println(cikar(a,b));

	}

}

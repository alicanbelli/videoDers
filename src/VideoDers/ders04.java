package VideoDers;

import java.util.Scanner;

public class ders04 {

	public static void main(String[] args) {
		// ax^2 + bx + c = 0 
		
		int a,b,c;
		
		float delta;
		float x1,x2;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("A deðerini giriniz :");
		a = scan.nextInt();

		System.out.println("B deðerini giriniz :");
		b = scan.nextInt();
		
		System.out.println("C deðerini giriniz :");
		c = scan.nextInt();
		
		delta = b*b-(4*a*c);
		System.out.println("Delta = " + delta);
		
		if(delta>0){
			x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
			x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if(delta==0){
			x1= -b/(2*a);
			System.out.println("Çakýþýk kök var x1 = " + x1);
		} else  if(delta<0){
			System.out.println("Kök yoktur!");
		}
		
	}

}

package VideoDers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ders35 {

	public static void main(String[] args) {
		// Java dosya iþlemleri
		File file = new File("dosya.txt");
		String yazi ;
		Scanner scan = new Scanner(System.in);
		
		int sayac = 0;		
		//yazma iþlemi
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			do {
				System.out.println("Adýnýzý giriniz:");
				yazi = scan.next();
				bw.append(yazi);
				bw.newLine();
				sayac++;
			} while (sayac<5);	
			
			bw.close();			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//okuma iþlemi
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			while((line=br.readLine()) !=null) {
				System.out.println(line);
			}
			br.close();			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println();

	}

}

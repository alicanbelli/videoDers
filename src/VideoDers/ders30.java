package VideoDers;

import java.util.Timer;
import java.util.TimerTask;

public class ders30 {
	
	static int sayac = 0;

	public static void main(String[] args) {
		// timer kullanýmý		
		
		Timer myTimer = new Timer();
		
		TimerTask gorev = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Merhaba");
				sayac++;
				if(sayac==10) myTimer.cancel();
			}
		};
		
		myTimer.schedule(gorev,0,1500); //1000 ms = 1 sn
		
		TimerTask gorev2 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("gorev2");
				
			}
		};
		
		myTimer.schedule(gorev2, 0, 200);

	}

}

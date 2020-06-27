package VideoDers;

/*class myThread extends Thread{
	public void run() {
		//yapýlacak iþler
	}
} */

public class ders32 {
	static int i,j;

	public static void main(String[] args) {
		// Thread kullanýmý

		Thread t1 = new Thread() {
			public void run() {
				for(i=0;i<100;i++) {
					System.out.print("F1- ");
				}
			}		
		};

		Thread t2 = new Thread() {
			public void run() {
				for(j=0;j<100;j++) {
					System.out.print("F2- ");
				}
			}		
		};

		t1.start();
		t2.start();

	}

}

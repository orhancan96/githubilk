package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			
		}
		System.out.println("Döngü Bitti Hocam ");
		
		for (int i = 3; i < 15; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For Döngüsü Bitti");

		//While döngüsü başlıyor
		int i=1;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("While döngüsü bitti");
		
		//Do-While Döngüsü
		int j=1;
		do {
			System.out.println(j);
		j+=2;
			
		}while (j<10);
		System.out.println("Do-While döngüsü bitti");
		
		

			
		
	}

}

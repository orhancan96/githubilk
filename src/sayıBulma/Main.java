package sayıBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,3,4,5,6,7,0};
		int aranacak = 5;
		
		boolean mevcut= false;
				
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				mevcut = true;
				break;
		   	}
		}
		
		if(mevcut) {
			System.out.println("Sayı mevcut");
			
		}else {
			System.out.println("Mevcut Değil");
		}
		
		

	}

}

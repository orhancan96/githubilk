package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 19;
		int sayi3 = 21;
		
		int EnBuyukSayi = sayi1;
		if(EnBuyukSayi<=sayi1) {
			EnBuyukSayi=sayi1;
		}
		if(EnBuyukSayi<sayi2) {
			EnBuyukSayi=sayi2;
		}
		if(EnBuyukSayi<sayi3) {
			EnBuyukSayi=sayi3;
		}
		System.out.println("En Büyük = "+EnBuyukSayi);
		
		
		
	}

}

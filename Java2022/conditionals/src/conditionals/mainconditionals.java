package conditionals;

public class mainconditionals {

	public static void main(String[] args) {
		int sayi = 12;
		if (sayi<20) {
			System.out.println("Sayı 20'den küçüktür");
			
			// tek eşittir bir sayıya değer verirken kullanılırken çift eşittir ise eşitlik durumu belirtir.
			
		}else if(sayi==20){
			System.out.println("Sayı 20'ye eşittir");
		}else {
			System.out.println("Sayı 20'den büyüktür"); //else diğer tüm durumlar için kullanılır.. else kullanımışsa sonuç kesin
													    // olarak alınır.
			
		}
		
	}

}

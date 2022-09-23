package arkadaşSayilar;

public class Main {

	public static void main(String[] args) { // 220-284  kendileri hariç pozitif tam bölenlerin sayısı diğer sayıya eşit olan sayılardır.
											// 220'nin pozitif tam bölen sayılarının toplamı 284'tür (ve vice versa.)
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}

		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (sayi1 == toplam2) {
			if (sayi2 == toplam1) {
				System.out.println("Bu Sayılar Arkadaştır.");
			}
		}												//else'yi kullanamadığın için ikinci bir içiçe if kullandın. else'yi kurcala.
		if (sayi1 != toplam2) {
			if (sayi2 != toplam1) {
				System.out.println("Bu Sayılar Arkadaş Değildir.");
			}
		}
	}
}

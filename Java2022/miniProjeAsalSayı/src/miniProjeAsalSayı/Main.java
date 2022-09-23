package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {

		int number = 13;
		int remainder = number % 2; // kalan bulma bu şekilde yapılır % operatörü böler.
		// System.out.println(remainder);

		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir");
			return; // seçilen numara 1 ise asal değildir deyip işlemi durdurmak için direkt return
					// kodunu yazıyoruz diğer döngülere girmemesi için
		}

		if (number < 1) {
			System.out.println("Sayı asal değildir");
			return;
		}

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isPrime = false;

			}
		}
		if (isPrime == true) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir");
		}
	}

}

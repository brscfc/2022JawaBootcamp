package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'D';	 //char ile harf tutulur. tekli parantezlerde

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B': //break bir sonucu diğerinden ayırmak (bitirmek)için kulanılır iki değerli birleştirmek için ise caseler alt altya 
							//tek sonuç verilir..	
		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalsef Kaldınız");
			break;
		default: 			// default kullanıcı ABCDEF değerlerinden baska bir değer girdiğinde uyarı vermek için kullanılır.
			System.out.println("Geçersiz Not Girdiniz");

		}

	}

}

package mükemmelSayı;

public class Main {

	public static void main(String[] args) {
		int number = 28;						// örnek 6 mükemmel sayıdır. tam bölenlerin toplamı kendisi eden sayılardır.
		int total =0;						// 6=> 1+2+3 =6
		
		for(int i=1; i<number;i++) {
			if(number % i == 0) {
				total=total+i;
				
			}
			
		}
		
		if(total==number) {
			System.out.println("Mükemmel Sayıdır.");	
		}else {
			System.out.println("Mükemmel Sayı Değildir.");
		}
		
	}

}

package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
		//kendisinden başka tüm bölenlerinin toplamı
		//kendisine eşit olan sayıya mükemmel sayı denir.
		//6 -->1,2,3
		//28-->1,2,4,7,14
		
		int number = 0;
		int total=0;
		
		//4
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
			
		}
			//1	
		for(int i =1;i<number;i++) {
			if(number%i==0) {
				total=total+i;
			}
		}//2
		if(number==total) {
			System.out.println("Mükemmel sayı");		
		}//3
		else {
			System.out.println("Mükemmel sayı değildir.");
		}
		System.out.println(total);
		}

	}



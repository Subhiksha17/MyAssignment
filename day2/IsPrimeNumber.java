package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int num=17;
		for(int i=2; i<num;i++){
			if(num%i==0) {
				System.out.println(num +" is not a prime number");
				break;
			}
			else {
				System.out.println(num +" is a prime number");
				break;}
			}
		}

}

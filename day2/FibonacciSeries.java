package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int first=1	;	
		int second;
for(int i=0;i<8;i++) {
	System.out.println(num);
	second=num+first;
	num=first;
	first=second;
	}

}
}
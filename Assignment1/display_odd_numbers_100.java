import java.util.Scanner;
public class display_odd_numbers_100 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for ( int i = 0 ; i <=num ; i++) {
	if(i % 2 != 0 ){
	System.out.println(i);
	}
	}

	}

}

package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = scanner.nextInt();
		
		int sum1 = 0;
		int sum2 = 0;
				
		for(int i =1; i <= number; i++){
			if(i % 2 == 0)
			{
				sum1 = sum1 + i;
			}else{
				sum2 = sum2 + i;
			}
		}
		
		if(number % 2 ==0){
			System.out.println(sum1);
		}else{
			System.out.println(sum2);
		}
		scanner.close();
	}
}

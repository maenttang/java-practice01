package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요:");
		String s = scanner.nextLine();
		
		/* 코드를 완성합니다. */
		int size = s.length();
		for(int  i=0; i<size; i++)
		{
			//System.out.println(s);
			for(int j = 0; j< 2; j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println("");
		}
		
		
		
		System.out.println(s);
		
		scanner.close();
	}

}

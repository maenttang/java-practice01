package practice01;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = scanner.nextInt();

		boolean contains1;
		boolean contains2;
		boolean contains3;
		
		
		int i =0; 
		while(i <= num)
		{
			String munja= String.valueOf(i);
			String str1 = "3";			
			String str2 = "6";			
			String str3 = "9";
			
			
			contains1 = munja.contains(str1); //true 반환
			contains2 = munja.contains(str2); //true 반환
			contains3 = munja.contains(str3); //true 반환
			
			
			if(contains1 == true || contains2 == true || contains3 == true)
			{
				System.out.print(i+"짝");				
				
				if(contains1 == true && contains2 == true) {
					System.out.println("짝");
				}else if(contains1 == true && contains3 == true) {
					System.out.println("짝");
				}else if(contains2 == true && contains3 == true) {
					System.out.println("짝");
				
				}
				
				System.out.println("");
		
			}
			
			i++;
		}
		
			

		scanner.close();
	}
}

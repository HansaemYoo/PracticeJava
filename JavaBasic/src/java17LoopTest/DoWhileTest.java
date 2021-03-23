package java17LoopTest;

import java.util.Scanner;

//17-2. 반복문- do-while문: 조건과 상관 없이 우선 수행을 한번 하고 조건체크
public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do{
			input = scanner.nextInt();
			sum += input;
		} while(input !=0);
		
		System.out.println(sum);
	}

}

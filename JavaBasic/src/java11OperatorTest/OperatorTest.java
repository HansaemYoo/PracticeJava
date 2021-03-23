package java11OperatorTest;
//import java.util.Scanner;

//11. 연산자
public class OperatorTest {

	public static void main(String[] args) {

			//증가 감소
			System.out.println("---증가감소---");
			int score = 150;
			System.out.println(score);
			
			int lastScore = score++; // 계산이 끝나고 값이 1증가
			System.out.println(lastScore); //150
			int lastScore2 = ++score; //먼저 값이 1증가된 후 계산
			System.out.println(lastScore2); //152
			
			//관계, 논리연산자
			System.out.println("---관계, 논리연산자---");
			int num1 = 10;
			int num2 = 2;
			boolean value = ((num1 = num1 + 10) < 10)&& ((num2 = num2 + 2) < 10); //두조건 모두 참일때 결과는 참
			System.out.println(value); //둘다 ture가 아니기 때문에 false
			System.out.println(num1); //num1에 10이 더해진 20 출력 
			System.out.println(num2); //num1에 10을 더한 값이 10보다 크기때문에 이미 false이므로 증가하지않음

			//조건연산자
			System.out.println("---조건 연산자---");
			
//			System.out.println("두 수를 입력 받아서 더 큰 수 출력하기");
//			Scanner scanner = new Scanner(System.in); //scanner- 값 입력받기
//			System.out.println("입력 1: ");
//			int i = scanner.nextInt();
			int i = 5;
			System.out.println(i);
//			System.out.println("입력 2: ");
//			int i2 = scanner.nextInt();
			int i2 = 10;
			System.out.println(i2);
			System.out.println("결과: ");
			
			//큰수 구하기
			int max = (i > i2) ? i : i2;
			System.out.println(max);
			
			//비트연산자
			System.out.println("---비트 연산자---");
			int b1 = 5; //00000101
			int b2 = 10; //00001010
			
			System.out.println(b1 | b2); //00001111
			System.out.println(b1 & b2); //00000000
			System.out.println(b1 ^ b2); //00001111
			System.out.println(~b1);
			System.out.println(b1 << 2); //00010100
			System.out.println(b1 <<= 2);
	}

}

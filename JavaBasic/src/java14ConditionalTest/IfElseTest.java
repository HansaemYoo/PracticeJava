package java14ConditionalTest;

import java.util.Scanner;
//14-1 조건문-If-Else
public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		if(money >= 20000) { 
			System.out.println("피자를 먹습니다."); //money가 20000보다 클 경우
		}else if(money >= 15000) {
			System.out.println("치킨을 먹습니다."); //money가 15000보다 클 경우
		} else {
			System.out.println("햄버거를 먹습니다."); //money가 15000보다 작을 경우
		}
		
		System.out.println("현재 가진 돈은 " + money + "원 입니다.");
	}

}

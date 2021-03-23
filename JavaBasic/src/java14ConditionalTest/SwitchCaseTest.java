package java14ConditionalTest;

import java.util.Scanner;

//14-2. 조건문-SwitchCase문
public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
			
/*			원래 SwitchCase문
 			case 1: case 3: case 5: case 7: case 8: case 10: case 12: //같은 케이스인 경우에는 한번에 써도 된다.
				day = 31;
				break; //break써주기
			case 2: 
				day = 28;
				break;
			case 4: case 6: case 9: case 11: 
				day = 30;
				break;
			default:
				System.out.println("존재하지 않는 달입니다.");
				day = -1; */
		
		//새로운 switch case문
		case 1, 3, 5, 8, 10, 12 ->
			31;
		case 2 ->
			28;
		case 4, 6, 9, 11 ->
			30;
		default -> { //여러 줄일땐 중괄호 사용
			System.out.println("존재하지않는 달입니다.");
			yield -1;
			}
		}; //int day = switch(month)의 끝이라는 의미로 세미콜론을 붙인다.
		System.out.println(month + "월의 일수는 " + day + "일 입니다.");
	}

}

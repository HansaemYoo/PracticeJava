package java17LoopTest;

//17-5. break문과 continue문
public class BreakAndContinueTest {

	public static void main(String[] args) {
		
		//break문-1부터 숫자를 더하여 합이 100이 넘는 순간의 그 숫자와 합 출력하기
		System.out.println("---break문---");
		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 100) {
				break; //합이 100이 넘으면 반복문을 빠져나오기
			}
		}
		System.out.println("sum: " + sum);
		System.out.println("num: " + num);
		
		//continue문-1부터 100까지의 숫자중 3의 배수 출력하기
		System.out.println("---continue문---");
		for(num = 1; num<=100; num++) {
			if(num % 3 !=0) { //num을 3으로 나눴을때 나머지가 0이 아니다=3의배수가 아니다.
				continue; //3의배수가 아니라면 다시 반복문실행
			}
			System.out.println(num);
		}
		
	}

}

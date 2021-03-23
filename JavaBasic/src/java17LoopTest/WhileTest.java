package java17LoopTest;

//17. 반복문-While문: 조건이 참인 동안 지정된 수행문을 반복적으로 수행하는 제어문
public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num <= 10) { //num이 10보다 작거나 같다는 조건이 참인동안 반복
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}

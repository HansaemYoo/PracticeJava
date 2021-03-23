package java17LoopTest;

//17-3. 반복문-For문
public class ForTest {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		for(int i = 0; i<10; i++, count++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum);
		System.out.println("count: " + count);
	}

}

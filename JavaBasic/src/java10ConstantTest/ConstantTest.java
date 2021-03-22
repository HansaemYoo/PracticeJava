package java10ConstantTest;

//10. 변하지않는수, 상수
public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100; //값이 정해져있는 상수는 앞에 final을 적어주며 중간에 변경할수없고, 변수명은 대문자로 나타낸다
		final int MIN_NUM = 20;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}

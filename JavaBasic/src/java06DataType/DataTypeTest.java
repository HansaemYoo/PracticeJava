package java06DataType;

//6. 자료형 표현하기
public class DataTypeTest {

	public static void main(String[] args) {
		
		System.out.println("-----정수형-----");
		//byte타입
		byte bNum = -127; //byte는 -128~127까지의 표현할 수 있다.
		System.out.println(bNum);
		
		//int타입
		int num = 123456789;
		System.out.println(num);
		
		//long타입
		long lNum = 12345678900L; //long은 숫자뒤에 L을 써주어야한다.
		System.out.println(lNum);

		//실수형
		System.out.println("-----실수형-----");
		double dNum = 3.14;
		float fNum = 3.14F; //float타입은 숫자뒤에 F를 붙여줘야한다.
		System.out.println(dNum);
		System.out.println(fNum);
		
		//문자형 - 음수는 사용할수 없다.
		System.out.println("-----문자형-----");
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //정수타입으로 강제변환
		
		char ch2 = 65;
		System.out.println(ch2); //65의 유니코드에 해당하는 A가 출력
		
		//논리형
		System.out.println("-----논리형-----");
		boolean isStudent = true;
		System.out.println(isStudent);
		
		//변수 자료형없이 사용하기 - 값이 명확한것은 타입을 지정해 주지않아도 알아서 정해진다.
		System.out.println("-----자료형없이 표현하기-----");
		var vNum = 200;
		System.out.println(vNum);
		var vStr = "문자";
		System.out.println(vStr);
		var vDouble = "3.14";
		System.out.println(vDouble);
		
	}

}

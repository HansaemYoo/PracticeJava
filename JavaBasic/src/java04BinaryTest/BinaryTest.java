package java04BinaryTest;

//4. 컴퓨터에서 자료 표현하기
public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; //0B숫자는 2진수
		int oNum = 012;	//0숫자는 8진수
		int xNum = 0XA; //0X숫자는 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}

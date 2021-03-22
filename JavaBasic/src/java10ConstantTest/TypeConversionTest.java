package java10ConstantTest;

//10-2. 형변환-작은크기->큰크기로는 자동 형변환 / 큰크기->작은크기는 강제로 변환해야한다.
public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int num = bNum; //int는 byte보다 크기가 크기때문에 자동으로 형변환된다.
		System.out.println(num);
		
		double dNum = num; //int에서 double은 자동으로 형변환 된다.
		System.out.println(dNum);
		
		byte bNum2 = (byte)num; //int에서 byte로 변환할때는 강제로 변환해야한다.
		System.out.println(bNum2);
		
		double dNum2 = 1.2;
		float fNum = 0.9F;
		
		int sum = (int)dNum2 + (int)fNum; //각각 int타입으로 강제변환후 더한것이므로 1이된다.
		System.out.println(sum);
		
		int sum2 = (int)(dNum2 + fNum); //둘이더한값을 강제변환한것이기 때문에 2가 된다.
		System.out.println(sum2);
	}

}

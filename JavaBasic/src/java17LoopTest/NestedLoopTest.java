package java17LoopTest;

//17-4. 중첩 반복문
public class NestedLoopTest {

	public static void main(String[] args) {

		//구구단
			int dan;
			int count;
			
			//for문
			for(dan = 2; dan <= 9; dan++) {
				for(count = 1; count<=9;count++) {
					System.out.println(dan + "X" + count + "=" + dan * count);
				}
				System.out.println();
			}
			
			//while문
			dan = 2;
			count = 1;
			while(dan <= 9) {
				count = 1; //while은 내부반복을 들어가기전에 초기화해야하는 부분이 있는지 확인해야한다.
				while(count <= 9) {
					System.out.println(dan + "X" + count + "=" + dan * count);
					count++;
				}
				dan++;
				System.out.println();
			}
	}

}

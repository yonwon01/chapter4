package lang;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));

		String s = "123a4";

		// natch
		if (s.matches(".*") == false) {// .*->문자열표시
			System.out.println("숫자가 아닙니다.");

		} else {
			//int i = Integer.parseInt(s);
		}

		// 프로그램 로직 할때는 try catch 문으로 하지말것->exception이렁나면 stack에쌓인거 메모리에 다올려야해서 비용이든다.
		
		System.out.println(Integer.parseInt("10",10));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
	}

}

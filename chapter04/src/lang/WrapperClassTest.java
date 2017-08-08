package lang;

public class WrapperClassTest {
	public static void main(String[] args) {

		Integer i = new Integer(10);
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);

		// autoBoxing
		Integer j = 10;
		// auto unboxing
		int k = 20 + j;

		Double d = new Double(3.14);
		Boolean g = new Boolean(false);


		swap(i,k);
	}

	public static void swap(Integer a, Integer b) {
		int temp=a;
		//객체이지만 내부를 수정 할 수 없다.
		a=b;
	}

}

package lang;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("this");
		System.out.println(sb.length()+":"+sb.capacity());//CAPCACITY 디폴트값이 16  ->16+4=20
		System.out.println(sb);

		//문자열 추가
		sb.append(" is pencil");
		System.out.println(sb);
		
		//삽입
		sb.insert(7, "my");
		System.out.println(sb);
		
		//치환
		sb.replace(8, 10, "yours");//8~9번째가 YOURS로바뀜	
		System.out.println(sb);
		
		//버퍼크기조정
		sb.setLength(3);
		System.out.println(sb);
		
		//문자열 + 연산은 내부적으로
		//StringBuffer로 객체로 변환
		String s1="Hello"+"world"+10+true;
		
		new StringBuffer("Hello").
		append(" world");
		
		StringBuffer sb2=new StringBuffer("Hello");
		StringBuffer sb3=sb2.append(" world").append(10).append(true);//연달아 쓸 수 있다//stringBUffer는 연산속도가 빠름
		System.out.println(s1);
		
	}	

}

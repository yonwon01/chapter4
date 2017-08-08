package lang;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point=new Point(10,20);
		
	    System.out.println(point.getClass().getName());//getClass는 Class라는 객체에 대한 정보를 가진 정보
	    System.out.println(point.hashCode());//참조값
	    System.out.println(point.toString());
	    System.out.println(point);
	    
	    System.out.println();
	    /*String 객체와 비교*/
	    String s = new String("");
	}

}

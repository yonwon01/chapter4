package lang;

public class Singleton {
	private static Singleton instance;
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	private Singleton() {//private으로 했기때문에 외부에서 객체 생성 못함
		
	}
	
}

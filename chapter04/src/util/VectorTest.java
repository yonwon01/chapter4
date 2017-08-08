package util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		// 1.2버전 전에
		Vector<String> v = new Vector<String>();

		// 1.2버전 전 :addElement

		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");

		// 순회1
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}

		// 삭제
		v.removeElementAt(1);
		
		System.out.println("======================");
		
		// 순회2
		int count=v.size();
		for(int i=0;i<count;i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		

		//1.2버전 이후에 추가된 것: add, get remove  

	}
}

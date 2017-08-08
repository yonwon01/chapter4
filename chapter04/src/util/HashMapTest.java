package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Map<String,Integer> map=new HashMap<String,Integer>();
			map.put("둘리", 100);//오토박싱->integer객체 안만들어줘도 됨
			map.put("마이콜", 10);
			map.put("도우넛", 20);
			map.put("길동",80);
			
			//중복
			map.put("둘리", 20);
			
			//auto unboxing
			int score=map.get("둘리");//키값이 중복 되면 value를 새로운 것으로 덮어 버린다.
			System.out.println(score);
			
			//삭제
			map.remove("둘리");
			
			//평균
			int sum=0;
			Set<String> keyset=map.keySet();
			Iterator<String> it=keyset.iterator();
			while(it.hasNext()) {
				String key=it.next();
				System.out.println(key);
				int s = map.get(key);
				sum+=s;
			}
			System.out.println("평균:" +(sum/keyset.size()));
			
			
	}

}

package util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
	
		
		Queue<String> queue=new LinkedList<String>();//큐는 링크드 리스트 사용                   
		
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우넛");
		queue.offer("길동");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty());
	}
}

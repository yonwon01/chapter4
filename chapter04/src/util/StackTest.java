package util;

import java.util.List;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack=new Stack<String>(); //스택은 배열을 사용하는 벡터

		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우넛");
		stack.push("길동");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());//pop은 안시키지만 return을 받는 것
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//stack은 비어있는 경우 pop()호출시 예외가 발생
		
	}

}

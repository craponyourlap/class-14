package class14;

import java.util.Stack;

public class TestStackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.add("vanier");
		s.add(23);
		System.out.println(s);
		s.add('3');
		System.out.println(s);
		s.pop();
	}

}

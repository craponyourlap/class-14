package class14;

import java.util.Iterator;

public class ArrayStack <Shit> implements Stack <Shit>, Iterable<Shit> {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(23);
		stack.push(123);
		stack.push(273);
		stack.push(2738);
		System.out.println("Size of array: "+stack.size());
		
		for (Iterator<Integer> iterator = ((ArrayStack<Integer>)stack).iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	private Shit container[];
	private int top;
	private int size;
	static int DEFAULT_SIZE = 10;
	
	class ArrayStackIterator implements Iterator<Shit>{
		
		int i = top;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > -1;
		}

		@Override
		public Shit next() {
			// TODO Auto-generated method stub
			return container[i--];
		}
		
	}
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		this.size = size;
		this.container = (Shit[]) new Object[size];
		this.top = -1;
	}
	
	public ArrayStack() {
		this(DEFAULT_SIZE);
	}
	@Override
	public void push(Shit element) {
		// TODO Auto-generated method stub
		if (!isFull()) {
			top++;
			container[top] = element;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Shit pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			int i = top;
			top--;
			return container[i];
		}
		return (Shit)Integer.valueOf(-1);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Shit peek() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			return container[top];
		}
		return (Shit)Integer.valueOf(-1);
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size - 1 == top;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Iterator<Shit> iterator() {
		// TODO Auto-generated method stub
		return new ArrayStackIterator();
	}
	
	
}

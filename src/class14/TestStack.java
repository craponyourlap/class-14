package class14;

import java.util.Arrays;

public class TestStack {
	
	int size; //helps you assign the size of the container
	//this is fucking stupid lmao
	int arr[]; 
	int top; //it's the only variable that all operations are being implemented
	
	
	public TestStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1; //so that if we add an element into this shit, the index of that element
		//will be zero, which is the first index of the array
	}
	
	// push method
	public void push(int pushedElement) {
		if(!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("pushed element is "+pushedElement);
		}
		else {
			System.out.println("stack is full, retard. you can't add more shit");
		}
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return size - 1 == top;
	}
	
	public int pop() {
		if (!isEmpty()) {
			int returnedElement = top;
			top--; //dont forget to decrement the index of the top lol
			System.out.println("pray for my boy "+arr[returnedElement]+" gone bruh he got popped out of the stack");
			return arr[returnedElement];
		}
		else {
			System.out.println("stack is empty, retard. here is ur fucking -1");
		}
		return -1; //this doesn't make any fucking sense bruh like this shit just ignores the if statements
		//so like, it's gonna return -1 regardless lol. make it make sense or some shit
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
	public void print() {
		if (!isEmpty()) {
			System.out.println("here is the stack: ");
			for (int i = top; i > -1; i--) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("the stack is fucking empty man, i can't give you shit");
		}
	}
	
	public int peek() {
		//different method to pop
		//cuz this allows u to look at the element without getting rid of it
		if (!isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("the stack is empty man, do something more productive than bothering me");
		}
		return -1;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStack container = new TestStack(10);
		container.pop();
		container.push(100);
		container.push(82);
		container.push(283);
		container.push(1283);
		container.push(2);
		container.print();
		System.out.println(container.toString());
		container.pop();
		System.out.println(container.peek());
	}

}

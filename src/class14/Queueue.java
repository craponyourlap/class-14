package class14;

public class Queueue {
	int front, back, capacity;
	int queue[];
	
	public Queueue(int c) {
		front = back = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	public void enqueue(int data) {
		if (capacity == back) {
			System.out.println("Queue is full");
		}
		else {
			queue[back] = data;
			back++;
		}
		
	}
	
	public void dequeue() {
		if (front == back) {
			System.out.println("queue is empty");
		}
		else {
			for (int i = 0; i < back - 1; i++) {
				// since there is an empty array at the front, we should shit the elements one index to the right
				queue[i] = queue[i + 1];
			}
			if (back < capacity)
				queue[back] = 0;
			back--;
		}
	}
	
	public void print() {
		int i;
		System.out.println("Elements in queue are: ");
		for (i = front; i < back; i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueue q = new Queueue(10);
		q.enqueue(10);
		q.enqueue(1283);
		q.enqueue(123);
		q.enqueue(754);
		q.enqueue(283);
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
		q.print();
		q.dequeue();
	}

}

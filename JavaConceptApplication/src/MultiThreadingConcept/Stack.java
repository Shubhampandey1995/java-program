package MultiThreadingConcept;

public class Stack {

	private int[] array;
	private int stackTop;
	Object lock;

	public Stack(int capacity) {
		array = new int[capacity];
		stackTop = -1;
		lock = new Object();
	}

	public synchronized boolean push(int element) {

		if (isFull())
			return false;
		++stackTop;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		array[stackTop] = element;
		return true;

	}

	public int pop(int element) {

		if (isEmpty())
			return Integer.MIN_VALUE;

		int obj = Integer.MIN_VALUE;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		stackTop--;
		return obj;

	}

	public boolean isFull() {

		return stackTop > array.length - 1;
	}

	public boolean isEmpty() {

		return stackTop < 0;
	}

}

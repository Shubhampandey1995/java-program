package MultiThreadingConcept;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

	private Queue<Integer> q;
	private int capacity;

	public BlockingQueue(int cap) {

		capacity = cap;
		q = new LinkedList<>();
		// TODO Auto-generated constructor stub
	}

	public boolean add(int item) {

		synchronized (q) {
			while (q.size() == capacity)
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			q.add(item);
			q.notifyAll();
			return true;
		}
	}

	public int remove() {

		synchronized (q) {
			while (q.size() == 0) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int element = q.poll();
			q.notifyAll();
			return element;
		}

	}
}

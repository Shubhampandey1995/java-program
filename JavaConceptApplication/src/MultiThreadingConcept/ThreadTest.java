package MultiThreadingConcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("main thread started"); Thread t1 = new Thread1();
		 * t1.start();
		 * 
		 * Thread t2 = new Thread(new Thread2()); t2.start();
		 * 
		 * System.out.println("existing thred finished");
		 */

		/*
		 * Stack s = new Stack(5);
		 * 
		 * new Thread(() -> { int counter = 0; while (++counter < 10)
		 * System.out.println("Pushed: " + s.push(100)); }, "Pusher").start();
		 * 
		 * new Thread(() -> { int counter = 0; while (++counter < 10)
		 * System.out.println("Poped: " + s.pop(100)); }, "Poped").start();
		 */

		/*
		 * Thread t3 = new Thread(() -> {
		 * 
		 * try {
		 * 
		 * Thread.sleep(1); for(int i= 100 ; i > 0 ; i--);
		 * 
		 * } catch (InterruptedException e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 * 
		 * }, "States");
		 * 
		 * t3.start();
		 * 
		 * while (true) { Thread.State state = t3.getState(); System.out.println(state);
		 * if (state == Thread.State.TERMINATED) break; }
		 */

		/*
		 * Thread t4 = new Thread(() -> {
		 * 
		 * System.out.println(Thread.currentThread()); }, "my thread");
		 * 
		 * t4.start();
		 * 
		 * try { t4.join(1); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * System.out.println("main exiting");
		 */

		/*
		 * 
		 // deadlock condition 
		 String lock1 = "shubham";
		 String lock2 = "pandey";

		Thread t5 = new Thread(() -> {

			synchronized (lock1) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (lock2) {

					System.out.println("lock acquired 1");
				}
			}
		}, "t5");

		Thread t6 = new Thread(() -> {

			synchronized (lock2) {
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (lock1) {

					System.out.println("lock acquired 2");
				}
			}
		}, "t6");

		t5.start();
		t6.start();*/
	}

}

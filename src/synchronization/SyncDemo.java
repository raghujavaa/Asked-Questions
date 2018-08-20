/*
 * This synchronization is implemented in Java with a concept called monitors. Only one thread can own a monitor at a given time. When a thread acquires a lock, it is said to have entered the monitor. All other threads attempting to enter the locked monitor will be suspended until the first thread exits the monitor.
 */
package synchronization;

//A Java program to demonstrate working of synchronized.

//Sender Class used to send a message:
class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}

		System.out.println("\n" + msg + "Sent");
	}// send()
}

// Class for send a message using Threads
class ThreadedSend extends Thread {
	private String msg;
	private Thread t;
	Sender sender;

	// Recieves a message object and a string message to be sent
	ThreadedSend(String m, Sender obj) {
		msg = m;
		sender = obj;
	}

	public void run() {
		// Only one thread can send a message at a time.
		synchronized (sender) {
			// synchronizing the snd object
			sender.send(msg);
		}// synchronized

	}// run()
}// ThreadedSend class

// Driver class Demo Program:
class SyncDemo {
	public static void main(String args[]) {
		Sender snd = new Sender();
		ThreadedSend S1 = new ThreadedSend(" Hi ", snd);
		ThreadedSend S2 = new ThreadedSend(" Bye ", snd);

		// Start two threads of ThreadedSend type:
		S1.start();
		S2.start();

		// wait for threads to end:
		try {
			S1.join();
			S2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}// main()
}// main class

/*
 * The output is same every-time we run the program.
 * 
 * In the above example, we chose to synchronize the Sender object inside the
 * run() method of the ThreadedSend class. Alternately, we could define the
 * whole send() block as synchronized and it would produce the same result. Then
 * we don’t have to synchronize the Message object inside the run() method in
 * ThreadedSend class.
 */
package synchronization;

//One more alternate implementation to demonstrate
//that synchronized can be used with only a part of 
//method
class SenderClass {
	public void send(String msg) {
		synchronized (this) {
			System.out.println("Sending\t" + msg);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread interrupted.");
			}
			System.out.println("\n" + msg + "Sent");
		}
	}
}
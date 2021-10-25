package threads;

public class NocProcess {
	public static void main(String[] args) {
		//OldSequentialWay();
	    FeeThread feeThread = new FeeThread();
	    feeThread.start();
	}

	private static void OldSequentialWay() {
		try {
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		//hostel
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		//transport
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		//library
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		}
		catch (Exception e) {
			
		}
	}

}

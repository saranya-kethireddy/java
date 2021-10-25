package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String[] args) {
	ExecutorService executorservice = Executors.newFixedThreadPool(6);
	
	for(int i=0; i<10; i++) {
		Runnable worker = new WorkerThread("job no "+1);
		executorservice.execute(worker);
	}
	executorservice.shutdown();
	
}
}

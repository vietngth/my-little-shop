package Camera;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.bytedeco.javacpp.opencv_core.Stream;

public class TestMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		GrabberShowUsesCallable gs = new GrabberShowUsesCallable();
		//GrabberShow gs = new GrabberShow();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(gs);
        String cc = future.get();
        System.out.println("Final result : " + cc);
        
    }
}
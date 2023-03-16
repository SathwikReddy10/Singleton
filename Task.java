import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task{

    private static Task task_singleton;
    private ExecutorService executor;

    private Task(){
        executor = Executors.newFixedThreadPool(3);
    }

    public static synchronized Task getInstance(){
        if(task_singleton == null){
            task_singleton = new Task();
        }
        return task_singleton;
    }

    public void execute(Runnable task) {
        executor.execute(task);
    }
}

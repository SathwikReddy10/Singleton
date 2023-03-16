public class job implements Runnable{

    private String name;

    public job(String s ) {
        name = s;
    }

    Task task = Task.getInstance();

    @Override
    public void run() {
        System.out.println("running "+name+"from task with "+ task.hashCode());
    }
}

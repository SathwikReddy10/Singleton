public class Main {
    public static void main(String[]args){
        Runnable job1 = new job("job1");
        Runnable job2 = new job("job2");
        Runnable job3 = new job("job3");
        Runnable job4 = new job("job4");
        job1.run();
        job2.run();
        job3.run();
        job4.run();
    }
}

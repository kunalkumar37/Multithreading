class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

class MyTask implements Runnable{
    public void run(){
        System.out.println("Running");
    }
}

public class Main {
    public static void main(String args[]){
        // MyThread t1=new MyThread();
        // t1.start();
        MyTask task= new MyTask();
        Thread t=new Thread(task);
        t.start();

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
        try{
            Thread.sleep(2000);

        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
    }
}

public class Test2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1=new MyThread();
        System.out.println(t1.getState()); //NEW

        t1.start();
        System.out.println(t1.getState()); //RUNNABLE

        Thread.sleep(1000);
        System.out.println(t1.getState()); //TIMED_WAITING

        t1.join();
        System.out.println(t1.getState()); //TERMINATED
        
        
    }
}

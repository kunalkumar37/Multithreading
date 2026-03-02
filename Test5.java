class MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName()+" is running ");
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
         MyThread t1=new MyThread();
    t1.setDaemon(true);
    MyThread t2=new MyThread();
    t2.start();
    t1.start();
    System.out.println("Mina done");
    }
   
}

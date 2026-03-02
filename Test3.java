class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread is running:");
        for(int i=0;i<=5;i++){
            for(int j=0;j<5;j++){
                System.out.println(Thread.currentThread().getName()+"- Priority:  "+Thread.currentThread().getPriority()+" -count: "+i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        MyThread t1= new MyThread("Low Priority Thread");
        MyThread t2= new MyThread("Medium Priority Thread");
        MyThread t3= new MyThread("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

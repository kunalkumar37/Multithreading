class World implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("World: " + i);
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        World w=new World();
        Thread t=new Thread(w);
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("Hello: " + i);

    }
}
}

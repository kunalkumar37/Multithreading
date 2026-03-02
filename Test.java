class World extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("World: " + i);
        }
    }
}

public class Test {
    public static void main(String args[]){
        World w=new World();
        w.start();
        for(int i=1; i<=5; i++){
            System.out.println("Hello: " + i);
        }
    }
}

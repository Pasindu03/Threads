class One implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("One");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Two implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        Thread Obj1 = new Thread(obj1);
        Thread Obj2 = new Thread(obj2);

        Obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Obj2.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Thread Obj1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++){
                System.out.println("One");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread Obj2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++){
                System.out.println("Two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Obj2.start();
    }
}

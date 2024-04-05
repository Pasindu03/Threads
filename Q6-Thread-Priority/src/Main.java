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
        Obj1.setPriority(Thread.MIN_PRIORITY);
        Obj2.setPriority(Thread.MAX_PRIORITY);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Obj2.start();
        try {
            Obj1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Obj2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("Thread Name : " + Obj1.getName() + " " + "Thread Priority : " + Obj1.getPriority());
        System.out.println("Thread Name : " + Obj2.getName() + " " + "Thread Priority : " + Obj2.getPriority());

    }
}

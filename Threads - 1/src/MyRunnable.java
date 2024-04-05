class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class ImplementingTheRunnableInterface {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}

class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

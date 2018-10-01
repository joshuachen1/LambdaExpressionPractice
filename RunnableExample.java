
public class RunnableExample {

    public static void main(String[] args) {
        // Anonymous inner class
        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        myThread.run();
    }
}

public class Main {
    public static void main(String[] args) {
        DATA data = new DATA();
        new Thread(() -> {
            int count = 0;
            while (true) {
                try {
                    data.increase();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }
        }, "A").start();
        new Thread(() -> {
            int count = 0;
            while (true) {
                try {
                    data.decrease();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }
        }, "B").start();
    }
}

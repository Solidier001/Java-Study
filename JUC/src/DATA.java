public class DATA {
    private int flag=0;

    private int count=0;

    public synchronized void increase() throws InterruptedException {
        if (flag!=0)this.wait();
        flag++;
        count++;
        System.out.println(count);
        flag--;
        this.notifyAll();
        this.wait();
    }
    public synchronized void decrease() throws InterruptedException {
        if (flag!=0)this.wait();
        flag++;
        count--;
        System.out.println(count);
        flag--;
        this.notifyAll();
        this.wait();
    }
}

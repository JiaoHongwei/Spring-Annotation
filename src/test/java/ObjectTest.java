import org.junit.jupiter.api.Test;

/**
 * @Description TODO
 * @Author hw
 * @Date 2018/12/4 16:32
 * @Version 1.0
 */
public class ObjectTest {

    static Thread thread1 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread1...");
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread2...");
        }
    });

    static Thread thread3 = new Thread(new Runnable() {
        public void run() {
            System.out.println("thread3...");
        }
    });


    @Test
    public void waitTest() throws InterruptedException {
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}

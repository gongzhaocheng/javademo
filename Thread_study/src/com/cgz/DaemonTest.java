package com.cgz;

/**
 * @author chenggongzhao.com
 * @version $Rev$
 * @des 守护线程是为用户服务的;JVM停止,不用等待守护线程执行完毕.
 * 默认所有都是用户线程，，jvm用户等待线程执行完毕才会停止
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class DaemonTest {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        Thread t = new Thread(god);
        // 将用户线程调整为守护
        t.setDaemon(true);
        t.start();
        new Thread(you).start();
    }
}
class You implements Runnable{
    private int LIFETIME=365*100;
    @Override
    public void run() {
        for (int i = 0; i < LIFETIME; i++) {
            System.out.println("happy life ....");
        }
        System.out.println("ooooo....");
    }
}

class God implements Runnable{

    @Override
    public void run() {
        for (; true;) {
            System.out.println("bless you ....");
        }
    }
}


package com.cgz;

/**
 * @author chenggongzhao.com
 * @version $Rev$
 * @des 线程同步
 * @updateAuthor $Author$
 * @updateDes 并发控制
 */
public class UnsafeTest01 {
    public static void main(String[] args) {
        // 一份资源
        UnsafeWeb12306 web = new UnsafeWeb12306();

        // 多个代理
        new Thread(web,"码农").start();
        new Thread(web,"码畜").start();
        new Thread(web,"蚂蟥").start();
    }
}

class UnsafeWeb12306 implements Runnable{
    private  int ticketNums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            test();
        }
    }

    private void test() {

        if (ticketNums < 0 ){
            flag = false;
            return;
        }
        // 模拟延时
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"..."+ticketNums--);
    }
}
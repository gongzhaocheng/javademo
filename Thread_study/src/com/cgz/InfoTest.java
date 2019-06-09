package com.cgz;

/**
 * @author chenggongzhao.com
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class InfoTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().isAlive());
        // 设置名称：真实角色+代理角色
        InfoThread info = new InfoThread("战斗机");
        Thread t = new Thread(info);
        //
        t.setName("程序猿");
        t.start();
        Thread.sleep(1000);
        System.out.println(t.isAlive());


    }
}
class InfoThread implements Runnable{
    private  String name;

    public InfoThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+name);
    }
}
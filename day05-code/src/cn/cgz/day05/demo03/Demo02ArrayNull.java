package cn.cgz.day05.demo03;

/**
 * @author chenggongzhao
 * @des
 * 所有的引用数据类型都可以赋值为一个null ，但是表示什么都没有。
 *
 * 数组必须new 初始化才能使用其中的元素
 * 如果只是赋值了null 没有进行new 创建那么将会
 *
 * 报空指针异常
 * NullPointerException
 *
 * 原因：忘了new
 * 解决：补上new
 * @create 2019-07-07-11:31
 */
public class Demo02ArrayNull {

    public static void main(String[] args) {
        int[] array = null;

//        array = new int[3];
        System.out.println(array[0]);
    }

}


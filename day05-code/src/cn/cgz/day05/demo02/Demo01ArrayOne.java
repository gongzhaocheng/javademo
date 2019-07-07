package cn.cgz.day05.demo02;

/**
 * @author chenggongzhao
 * @des 数组的使用
 * @create 2019-07-07-10:56
 */
public class Demo01ArrayOne {

    public static void main(String[] args) {

        // 动态初始化数组值
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("==============");

        // 改变数组中的值
        array[0] = 10;
        array[1] = 20;

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }



}

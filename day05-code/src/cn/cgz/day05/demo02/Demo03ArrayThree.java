package cn.cgz.day05.demo02;

/**
 * @author chenggongzhao
 * @des 把数组中的值，赋值给另外一个数组
 * @create 2019-07-07-10:56
 */
public class Demo03ArrayThree {

    public static void main(String[] args) {

        // 动态初始化数组值
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==============");

        // 改变数组中的值
        arrayA[0] = 10;
        arrayA[1] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("+++++++++++++++");
        // 动态初始化数组值
        int[] araayB = arrayA; // 引用数组类型，保存的是地址值
        System.out.println(araayB);
        System.out.println(araayB[0]);
        System.out.println(araayB[1]);
        System.out.println(araayB[2]);
        System.out.println("==============");

        // 改变数组中的值
        araayB[0] = 100;
        araayB[1] = 200;
        System.out.println(araayB);
        System.out.println(araayB[0]);
        System.out.println(araayB[1]);
        System.out.println(araayB[2]);

        System.out.println("+++++++++++++++");

        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
    }



}

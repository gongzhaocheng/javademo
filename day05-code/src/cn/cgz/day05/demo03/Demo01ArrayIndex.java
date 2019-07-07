package cn.cgz.day05.demo03;

/**
 * @author chenggongzhao
 * @des 数组的索引编号从0 到数组的长度减1 位置
 * 当引用的数组的值，越界
 *
 * ArrayIndexOutOfBoundsException
 *
 * 原因：索引编号写错了
 * 解决：修改成正确的编号值
 * @create 2019-07-07-11:31
 */
public class Demo01ArrayIndex {

    public static void main(String[] args) {
        int[] array = { 100, 200, 300 };

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[3]);
    }

}


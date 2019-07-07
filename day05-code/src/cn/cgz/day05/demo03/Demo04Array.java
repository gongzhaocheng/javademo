package cn.cgz.day05.demo03;

/**
 * @author chenggongzhao
 * 数组遍历
 * @create 2019-07-07-12:06
 */
public class Demo04Array {

    public static void main(String[] args) {
        int[] array = {10,20,35,45,55,66};

        // 首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("----------------------------");
        
        // 使用循环，次数就是相应的数组长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        System.out.println("----------------------------");
        // 使用 数组名.length  获得循环次数
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    
}

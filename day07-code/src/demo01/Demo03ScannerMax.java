package demo01;

import java.util.Scanner;

/**
 * @author chenggongzhao
 * @des 题目
 * 键盘输入三个数字，然后求出其中的最大值。
 *
 * 思路：
 * 1. 既然是键盘，肯定用到Scanner
 * 2. Scanner 三个步骤：导包、创建、使用nextInt()方法
 * 3. 三个数字调用三次nextInt()方法，得到三个Int变量
 * 4. 无法同时判断三个数字谁最大，应该转换成两个步骤
 *  4.1 首先判断前两个数字谁最大，拿到前两个最大的值
 *  4.2 用前面的最大值，和第三个数比较
 * 5. 打印最终结果
 *
 * @create 2019-07-07-19:33
 */
public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();

        // 首先得到前面两个数的最大值
        int temp = a > b ? a : b;
        int max = temp > a ? temp : a;

        System.out.println("max = " + max);
    }

}

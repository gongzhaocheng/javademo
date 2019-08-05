package demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author chenggongzhao
 * @des 题目: 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，存放到小集合中。
 * 要求用自定义的方法来实现
 *
 * 分析：
 * 1. 需要创建一个大集合，用来存储int数字，<Integer>
 * 2. 随机数用Random nextInt
 * 3. 循环20次，把随机数字放到大集合中；for 循环、add 方法
 * 4. 定义一个方法，用来进行筛选
 * 筛选，根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 返回值类型：ArrayList小集合（ 里面元素个数不确定）
 * 方法名称：getSmallList
 * 参数列表：ArrayList大集合（装着20个随机数字）
 * 5. 判断（if） 是偶数；num % 2 == 0
 * 6. 如果是偶数放到小集合中，否则不放
 *
 * @create 2019-07-10-22:54
 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {

        ArrayList<Integer> bigList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            bigList.add(new Random().nextInt(100)+1);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);

        System.out.println("偶数总共有多少个"+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

    }

    /**
     *
     * @param bigList
     * @return smallList
     */
    private  static ArrayList<Integer>  getSmallList( ArrayList<Integer> bigList ) {
        ArrayList<Integer>  smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            Integer num = bigList.get(i);
            if( num % 2 == 0){
                smallList.add(num);
            }
        }

        return smallList;

    }
}

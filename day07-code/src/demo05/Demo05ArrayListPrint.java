package demo05;

import java.util.ArrayList;

/**
 * @author chenggongzhao
 * @des ${TODO}
 * @create 2019-07-10-22:09
 */
public class Demo05ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("宋远桥");
        list.add("张三丰");
        list.add("张翠山");

        System.out.println(list);
        ArrayPrintList(list);

    }

    /**
     *定义方法的三要素
     *     返回值类型：只有打印，返回值为空
     *     方法名称：ArrayPrintList
     *     参数列表：ArrayList<String>
     */
    public static void ArrayPrintList(ArrayList<String> list) {

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);

            if (i == list.size()- 1){
                System.out.println(name+"}");
            }else {
                System.out.print(name+"@");
            }
        }


    }

}

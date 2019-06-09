package com.cgz;

import java.io.File;

/**
 * @author chenggongzhao.com
 * @version $Rev$
 * @des File.separator 文件分隔符
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class pathDemo {
    public static void main(String[] args) {
        String path ="/Users/cgz/IdeaProjects/javademo/IO_Study/src/com/cgz/pathDemo.java";
        path ="/Users/cgz/IdeaProjects/javademo/IO_Study/src/com/cgz"+ File.separator+"pathDemo.java";
        System.out.println(path);
        // 绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(src.getPath());
        // 构建一个不存在路径
        File src1 =  new File("io/haha.png");
        System.out.println(src1.getAbsolutePath());

    }
}

package com.msb.test13;

import java.util.Scanner;

/**
 * @author wzy
 * @create 2024-01-03 22:39
 *
 * [老马书城集合版]项目功能:1.展示书籍2.上新书籍3.下架书籍4.退出应用
 */
public class Test {
    public static void main(String[] args) {
        while (true) {
            //打印菜单
            System.out.println("---欢迎来到老马书城---");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //借助scanner类
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入想要执行的序号:");
            int choice = sc.nextInt();//点击回车程序才可以接到这个数据
            //根据choice进行后续判断
            if (choice == 1) {
                System.out.println("1.展示书籍");
            }
            if (choice == 2) {
                System.out.println("2.上新书籍");
                System.out.println("录入编号：");
                int bno=sc.nextInt();
                System.out.println("录入名字：");
                int bNo=sc.nextInt();

            }
            if (choice == 3) {
                System.out.println("3.下架书籍");
            }
            if (choice == 4) {
                System.out.println("4.退出应用");
                break;//停止正在执行的循环
            }
        }
    }
}

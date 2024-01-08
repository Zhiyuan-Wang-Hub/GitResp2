import java.util.Arrays;

/**
 * @author wzy
 * @create 2024-01-05 16:50
 */
public class Test {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int [] arr=new int[4];
        arr[0]=11;
        arr[1]=81;
        arr[2]=98;
        arr[3]=66;
        Arrays.toString(arr);
       int d= eat();
       System.out.println(d);
    }
    public static int eat(){
        System.out.println("--1");
        System.out.println("--2");
        System.out.println("--3");
        return 10;
    }
}

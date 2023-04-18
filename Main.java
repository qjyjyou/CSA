import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //打印选择题答案
        System.out.println("1、B  2、B  3、D  4.B  5、D") ;

        //1.打印三角
        //showTriangle();

        //2.字符串颠倒
        //reverseString();

        //3.回⽂数判断
        //isPalindrome();

        //4.水仙花数
        //ShuiXianHua();

        //数组中的最大数和最小数
        arraysDemo();

    }
    public static void showTriangle(){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();//n为行数
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=2*n-1; j++) {
                //打印*前的空格
                if(i+j<=n){
                    System.out.print(" ");
                }
                //打印*后的空格
                else if(j>=n+i){
                    System.out.print(" ");
                }
                //打印*
                else {
                        System.out.print("*");;
                }
            }
            //换行
            System.out.println();
        }
    }//打印三角
    public static void reverseString() {
        //用数组完成 转换工具见下
        // char[] chars = s .toCharArray();// 字符串转化为字符数组
        // String s1 = String.valueOf(chars);//字符数组转化为字符串
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        char []chars=s.toCharArray();
        char temp;
        for (int i = 0; i < chars.length/2; i++) {
            temp=chars[i];
            chars[i]=chars[chars.length-1];
            chars[chars.length-1]=temp;
        }
        String s1=String.valueOf(chars) ;
        System.out.println(s1);


        //方法二 System.out.println(new StringBuffer(s).reverse().toString()) ;
    }//字符串颠倒
    public static void isPalindrome() {
        boolean flag = true;
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        String s=String.valueOf(a);
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1))
                flag=false;
            else
                continue;
        }
        if (flag) {
            System.out.println("是的") ;
        }
        else
            System.out.println("不是") ;
    }//回⽂数判断
    public static void ShuiXianHua() {
        int i;

        for ( i = 100; i < 1000; i++) {
            int g=i%10;
            int s=i/10%10;
            int b=i/100;
            if (g * g * g + s * s * s + b * b * b == i)
                System.out.print(i+" ");
        }
    }//水仙花数
    public static void arraysDemo() { //操作
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int max=arr[0];
        int min=arr[0];
        for(int i:arr){
            if(i>=max)
                max=i;
            if(i<=min)
                min=i;
        }
        System.out.println("max："+max+",min="+min);
    }//数组中的最大数和最小数
}
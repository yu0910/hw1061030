import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        if (v1>=0){
            if(v1%4 != 0){
                System.out.println("平年");
            }else if(v1%400==0){
                System.out.println("閏年");
            }else if(v1%100==0){
                System.out.println("平年");
            }else{
                System.out.println("閏年");
            }
        }
    }
}

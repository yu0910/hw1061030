import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        if (v1 >0 &&v1 <=12){
            if(v1 >= 3 && v1 <= 5 ){
                System.out.println("Spring");
            }else if(v1 >=6 && v1 <= 8){
                System.out.println("Summer");
            }else if(v1 >= 9 && v1 <=11){
                System.out.println("Autumn");
            }else {
                System.out.println("Winter");
            }
        }else{
            System.out.println("Error");
        }
    }
}

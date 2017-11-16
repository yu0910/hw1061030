import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2=scn.nextInt();
        switch (v1){
            case 1:
                if (v2 <= 20)
                    System.out.println("Capricorn");
                else
                    System.out.println("Aquarius");
                break;
            case 2:
                if (v2 <= 18)
                    System.out.println("Aquarius");
                else
                    System.out.println("Pisces");
                break;
            case 3:
                if (v2 <= 21)
                    System.out.println("Pisces");
                else
                    System.out.println("Aries");
                break;
            case 4:
                if(v2 <= 20)
                    System.out.println("Aries");
                else
                    System.out.println("Taurus");
                break;
            case 5:
                if(v2 <=21)
                    System.out.println("Taurus");
                else
                    System.out.println("Gemini");
                break;
            case 6:
                if(v2 <= 21)
                    System.out.println("Gemini");
                else
                    System.out.println("Cancer");
                break;
            case 7:
                if (v2 <=22)
                    System.out.println("Cancer");
                else
                    System.out.println("Leo");
                break;
            case 8:
                if(v2 <= 23)
                    System.out.println("Leo");
                else
                    System.out.println("Virgo");
                break;
            case 9:
                if(v2 <=23)
                    System.out.println("Virgo");
                else
                    System.out.println("Libra");
                break;
            case 10:
                if(v2 <= 23)
                    System.out.println("Libra");
                else
                    System.out.println("Scorpio");
                break;
            case 11:
                if (v2 <= 22)
                    System.out.println("Scorpio");
                else
                    System.out.println("Sagittarius");
                break;
            case 12:
                if(v2 <=21)
                    System.out.println("Sagittarius");
                else
                    System.out.println("Capricorn");
                break;
        }
    }
}

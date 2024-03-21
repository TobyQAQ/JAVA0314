import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        System.out.println("請輸入一個數字：");
         Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println("你輸入的數字是："+ b);

//================================================================

        String c ="teacher";
        System.out.println(c);

//================================================================

        System.out.println("請輸入一串字：");
        Scanner a = new Scanner(System.in);
        String b = a.next();
        System.out.println("你輸入的字串是："+ b);

//================================================================

        String d ="teacher";
        char e = d.charAt(d.length()-1);
        //charAt 要從0開始算
        System.out.println(d+"的最後一個字符是"+e);

//================================================================

        String f ="Mary is a girl.";
        String g = f.substring(5);
        System.out.println(g);

//================================================================

        String h ="Mary is a girl.";
        String i = h.substring(3,7);
        System.out.println(i);

//================================================================

        String j ="teacher";
        String k ="student";

        boolean l = j.equals(k);

        if (l)
        {
            System.out.println("兩個字串不一樣");
        }
        else
        {
            System.out.println("兩個字串一樣");
        }

//================================================================
        System.out.println("請輸入1或2：");
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();

        switch (n){
            case 1:
                System.out.println("新年快樂");
                break;

            case 2:
                System.out.println("明天見");
                break;

            default:
                System.out.println("你錯了");
                break;
        }
*/
//================================================================

        System.out.println("請輸入a或b：");
        Scanner m = new Scanner(System.in);
        String n = m.nextLine();

        switch (n){
            case "a":
                System.out.println("新年快樂");
                break;

            case "b":
                System.out.println("明天見");
                break;

            default:
                System.out.println("你錯了");
                break;
        }

    }
}
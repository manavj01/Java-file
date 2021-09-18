import java.util.*;
public class Power {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int p = scn.nextInt();

        scn.close();
        System.out.println(power(n,p));

    }
    public static int power(int n, int p) {

        if(p == 0) {
            return 1;
        }

        if(p % 2 == 0) {
            return power(n,p/2) * power(n,p/2);
        }

        return n* power(n,p/2) * power(n,p/2);
    }
}
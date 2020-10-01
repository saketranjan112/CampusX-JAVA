import java.io.*;
import java.util.*;

public class GCD{

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        int res = gcd(a, b);
        System.out.println(res);
    }
    
    public static int gcd(int a, int b) {
        
        int x, y;
        x = (a > b) ? a : b;
        y = (x==a) ? b : a;
        
        if (y == 0){
            return x;
        }else{
            return gcd(y, x % y);
        }
   }
}
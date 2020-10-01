import java.util.Scanner;

public class Superdigit{

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String n = input.split(" ")[0];
        int k  = Integer.parseInt(input.split(" ")[1]);
        String P = new String();
        for (int i = 0; i < k; i++){
            P += n;
        }
        int res = super_digit(Integer.parseInt(P));
        System.out.println(res);
    }

    public static int super_digit(int P){

        if(P/10 == 0 && P!=10){
            return P;
        }else{
            int r = P % 10;
            return super_digit(r + super_digit(P/10));
        }
    }
}

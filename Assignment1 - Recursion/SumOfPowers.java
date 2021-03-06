import java.util.Scanner;

class SumOfPowers{

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int x = Integer.parseInt(input.split(" ")[0]);
        int n = Integer.parseInt(input.split(" ")[1]);
        System.out.println( num_ways(x, n, 1, 0) );
    }

    static int power(int num, int n)
    {
        int res = 1;

        for(int i = 0; i < n; i++){
            res *= num;
        }

        return res;
    }

    static int num_ways(int x, int n, int nums,int sum)
    {
        int results = 0;

        int p = power(nums, n);
        while (p + sum < x)
        {
            results += num_ways(x, n, nums + 1,
                    p + sum);
            nums++;
            p = power(nums, n);
        }

        if (p + sum == x) {
            results++;
        }

        return results;

    }


}


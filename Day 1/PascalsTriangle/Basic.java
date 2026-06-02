import java.util.Scanner;
public class Basic {
    //Function to find the value at Rth row and Cth column
    public static int Value(int R , int C){
        if (C==1  || C==R ) {
            return 1;
        }
        return Value(R-1,C-1) + Value(R-1, C);
    }

    public static void main(String[] args) {
        int R=5,C=3;
        System.out.println(Value(R , C));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int num = 1;

            // Print Pascal Triangle values
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}

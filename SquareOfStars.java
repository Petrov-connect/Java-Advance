import java.util.Scanner;
// created by J.M.
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i=1 ; i<=n; i++){
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

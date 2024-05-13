import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int N2[] = new int[N];
        for(int i = 0; i < N; i++){
            N2[i] = in.nextInt();
        }
        Arrays.sort(N2);
        for(int i = 0; i < N - 1; i++){
            System.out.print(N2[i]+ " ");
        }
        System.out.println(N2[N - 1]);
    }
}

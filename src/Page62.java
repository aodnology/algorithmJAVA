import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Page62 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("재료의 개수 : ");
        int N = Integer.parseInt(bf.readLine());
        System.out.printf("갑옷이 완성되는 번호의 합 : ");
        int M = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        System.out.printf("재료(공백을 두고 입력) : ");
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println("만들 수 있는 갑옷의 개수 : " + count);
        bf.close();
    }
}
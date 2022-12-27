import java.util.Scanner;
// 백준 1546
public class Page41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 시험 본 과목 갯수
        int N = s.nextInt();
        // 시험 본 과목 갯수 만큼의 배열
        int A[] = new int[N];

        // 배열에 각 과목의 점수를 저장
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        // 총점
        long sum = 0;
        // 최고점
        long max = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }
        // (A과목 + B과목 + C과목) *100 / 최고점(max) / N(과목의 총 갯수)
        System.out.println(sum * 100.0 / max / N);
    }
}
/*
    최고 점수를 기준으로 전체 점수를 다시 계산해야 하므로 모든 점수를 입력 받은 후(12)
    최고점을 별도로 저장해야 한다.
    문제에서 제시한 한 과목의 점수를 계산하는 식({과목 점수(A[i])}/{최고점수(MAX)}*100)은
    총합과 관련된 식으로 변환이 가능하다(24)
    따라서 일일이 변환 점수를 구할 필요 없이 한번에 변환한 점수의 평균 점수를 구할 수 있다.
* */
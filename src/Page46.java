import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Page46 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo +1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q <quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
/*

    BufferdReader (8)
    : 선언방법
      BufferedReader bf(변수명) = new BufferedReader(new InputStreamReader(System.in));
      String s = bf.readLine();

      Scanner와 유사 하지만 입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높인다
      하지만 Enter만 경계로 인식하고 받은 데이터가 String 타입으로 고정되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다

    readLine()
    : 입력을 받음
      리턴 값이 String으로 고정되어있어 다른 타입으로 입력을 받으려면 형변환을 해야됨
      ex) int i = Integer.parseInt(bf.readLine());

    StringTokenizer (9)
    : 선언방법
      StringTokenizer st(변수명) = new StringTokenizer(s)
      공백단위로 데이터를 가공할때 사용
* */
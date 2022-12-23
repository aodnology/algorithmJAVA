import java.util.Scanner;

// 숫자의 합 구하기
// 백준 11720
// 조건 : N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성

public class Page37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자의 개수 : ");
        int N = s.nextInt();

        System.out.print("공백 없이 "+N+"개의 숫자 입력 : ");
        String sNum = s.next();
        char[] cNum = sNum.toCharArray();
        // sNum(String문자열).toCharArray();
        // : 문자열을 한 글자씩 쪼개서 char타입의 배열에 집어넣어주는 메소드
        // char(정수형) 형식은 표현할 수 있는 문자 집합 멤버의 정수 값을 저장하는데 사용
        //
        int sum = 0;
        for (int i =0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
            System.out.println(i+1 +"번째 숫자의 합 : "+sum);
        }
        System.out.println(sum);
    }
}
/*
    N의 범위가 1부터 100까지이므로 값을 int형, long형과 같은 숫자형으로 담을 수 없다.
    먼저 문자열 형태로 입력값을 받은 후(8) 이를 문자열 배열로 변환(9)하고,
    문자 배열값을 순서대로 읽으면서 숫자형으로 변환하여 더한다.
*/
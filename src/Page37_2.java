import java.util.Scanner;

public class Page37_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자의 개수 : ");
        int N = s.nextInt();

        System.out.print("공백 없이 "+N+"개의 숫자 입력 : ");
        String sNum = s.next();
        int sum = 0;
        s.close();

        for (int i = 0; i < sNum.length(); i++){
            sum += sNum.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
/*
    charAt()
    : String으로 저장된 문자열 중에서 한 글자만 선택해 char타입으로 변환한다.
    반복문에 사용하면 한번에 String -> char -> intager 형변환이 가능하다.
 */
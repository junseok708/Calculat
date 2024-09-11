import java.util.*;

public class InfoInput {

    public static void input() throws Exception {
        //정규식 검사를 위한 객체 생성
        Regular regular = new Regular();

        //콘솔로 입력 받기 위한 스케너 객체 생성
        Scanner sc = new Scanner(System.in);

        //첫번째 숫자 입력
        System.out.println("숫자를 입력해주세요");
        String FirstInput = sc.nextLine();
        regular.CheckFirstNum(FirstInput);

        //연산자 입력
        System.out.println("연산자를 입력해주세요");
        String operator = sc.nextLine();
        regular.CheckSign(operator);

        //두번째 숫자 입력
        System.out.println("숫자를 입력해주세요");
        String secondInput = sc.nextLine();
        regular.CheckSecondNum(secondInput);

        //연산 값 출력
        System.out.println(regular.execut());
    }
}

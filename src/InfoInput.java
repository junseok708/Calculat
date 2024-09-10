import java.util.*;

public class InfoInput {

    public static boolean input() throws Exception{
        Regular regular = new Regular();
        Scanner sc =new Scanner(System.in);

        System.out.println("===============");
        System.out.println("숫자를 입력해주세요");
        String FirstInput = sc.nextLine();
        regular.CheckFirstNum(FirstInput);

        System.out.println("===============");
        System.out.println("연산자를 입력해주세요");
        String operator = sc.nextLine();
        regular.CheckSign(operator);

        System.out.println("===============");
        System.out.println("숫자를 입력해주세요");
        String secondInput = sc.nextLine();
        regular.CheckSecondNum(secondInput);

        System.out.println(regular.execut());

        return false;
    }
}

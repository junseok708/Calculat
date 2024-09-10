import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean End = false;

        while (!End){
            try {
                End = InfoInput.input();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void Lv_1() {
        Scanner sc = new Scanner(System.in);

        String numberCheck = "";
        int firstNumber = 0;
        int secondNumber = 0;
        String algorithmTest = "";
        String algorithm = "";
        int answer = 0;

        for (; ; ) {
            System.out.println("계산할 숫자를 입력해주세요");
            System.out.println("-------------");

            System.out.println("숫자를 입력해주세요");
            try {
                firstNumber = sc.nextInt();
                sc.nextLine();
                if (firstNumber < 0) {
                    System.out.println("양수만 입력해주세요");
                    break;
                } else if (firstNumber == 0) {
                    System.out.println("0이 입력되었습니다");
                    System.out.println("0보다 큰 수를 입력해세요");
                    break;
                }
            } catch (InputMismatchException e) {
                if (sc.nextLine().equals("exit")) {
                    System.out.println("시스템을 종료합니다.");
                    break;
                }
                System.out.println("숫자만 입력해주세요");
                break;
            }

            System.out.println("연산를 입력해주세요");
            algorithmTest = sc.nextLine();
            switch (algorithmTest) {
                case "+":
                    algorithm = algorithmTest;
                    break;

                case "-":
                    algorithm = algorithmTest;
                    break;

                case "/":
                    algorithm = algorithmTest;
                    break;

                case "*":
                    algorithm = algorithmTest;
                    break;

                default:
                    System.out.println("연산를 입력해주세요");
                    algorithm = sc.nextLine();
                    if (sc.nextLine().equals("exit")) {
                        System.out.println("시스템을 종료합니다.");
                        break;
                    }

            }


            System.out.println("숫자를 입력해주세요");
            try {
                secondNumber = sc.nextInt();
                sc.nextLine();
                if (secondNumber < 0) {
                    System.out.println("양수만 입력해주세요");

                } else if (secondNumber == 0) {
                    System.out.println("0이 입력되었습니다");
                    System.out.println("0보다 큰 수를 입력해세요");

                }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해주세요");
                if (sc.nextLine().equals("exit")) {
                    System.out.println("시스템을 종료합니다.");
                    break;
                }
            }

            switch (algorithm) {
                case "+":
                    answer = firstNumber + secondNumber;
                    break;

                case "-":
                    answer = firstNumber - secondNumber;
                    break;

                case "/":
                    answer = firstNumber / secondNumber;
                    break;

                case "*":
                    answer = firstNumber * secondNumber;
                    break;
                default:
            }
            System.out.println("-----");
            System.out.println("| " + answer + " |");
            System.out.println("-----");

        }
    }
}
//a
import java.util.*;

public class Main {


    public static void main(String[] args) {
        //무한 반복문
        while (true) {
            try {
                //연산의 시작
                InfoInput.input();
            } catch (Exception e) {
                //연산중 오류가 뜨면 예외처리된 메세지 출력
                System.out.println(e.getMessage());
            }
        }
    }

    public void Lv_1() {
        //입력을 위한 스케너 객체 인스턴스화
        Scanner sc = new Scanner(System.in);

        // 전역 변수들
        String numberCheck = "";
        int firstNumber = 0;
        int secondNumber = 0;
        String algorithmTest = "";
        String algorithm = "";
        int answer = 0;

        //실질적인 시스템의 운용
        while(true) {
            System.out.println("계산할 숫자를 입력해주세요");
            System.out.println("-------------");

            //첫번째 숫자를 입력받고 숫자인지 검사
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
                // 문자가 입력 받았을 시 예외 사항
            } catch (InputMismatchException e) {
                // 그중 "exit"을 입력 받으면 종료
                if (sc.nextLine().equals("exit")) {
                    System.out.println("시스템을 종료합니다.");
                    break;
                }
                System.out.println("숫자만 입력해주세요");
                break;
            }

            //연산자에 따른 연산 입력과 연산자인지 검사
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

                // 연산자가 아닌것을 검사하는 부분
                default:
                    System.out.println("연산를 입력해주세요");
                    algorithm = sc.nextLine();
                    if (sc.nextLine().equals("exit")) {
                        System.out.println("시스템을 종료합니다.");
                        break;
                    }

            }

            // 두번째 숫자를 입력받고 숫자인지 검사
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
                // 문자가 입력 받았을 시 예외 사항
            } catch (InputMismatchException e) {
                // 그중 "exit"을 입력 받으면 종료
                if (sc.nextLine().equals("exit")) {
                    System.out.println("시스템을 종료합니다.");
                    break;
                }
                System.out.println("숫자만 입력해주세요");
            }

            //연산자에 따른 연산
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

            //연산에 따른 값 출력
            System.out.println("-----");
            System.out.println("| " + answer + " |");
            System.out.println("-----");

        }
    }
}

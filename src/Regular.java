import java.util.regex.Pattern;

import Four_Basic.*;

public class Regular {
    //숫자와 문자를 검사할 수 있게 미리 정한 정규식
    private static final String operation = "[+\\-*/]";
    private static final String number = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    //정규식을 통한 첫번째 숫자 검사
    public Regular CheckFirstNum(String FirstNum) throws Exception {
        ExitSign(FirstNum); // 종료 메서드
        if (!Pattern.matches(number, FirstNum)) { // 보내진 문자열이 졍규식에 포함되있는지 확인
            throw new InoutExceotion("정수"); // 예외처리시 입력할 타입
        }
        this.calculator.DTO.setFirstNumber(Integer.parseInt(FirstNum)); // 검사가 통과된 숫자 setter로 저장

        return this;
    }
    //정규식을 통한 두번째 숫자 검사
    public Regular CheckSecondNum(String SecondNum) throws Exception {
        ExitSign(SecondNum);// 종료 메서드
        if (!Pattern.matches(number, SecondNum)) { // 보내진 문자열이 졍규식에 포함되있는지 확인
            throw new InoutExceotion("정수"); // 예외처리시 입력할 타입
        }
        this.calculator.DTO.setSecondNumber(Integer.parseInt(SecondNum)); // 검사가 통과된 숫자 setter로 저장

        return this;
    }

    //정규식을 통한 연산자 검사
    public Regular CheckSign(String operation) throws Exception {
        ExitSign(operation);// 종료 메서드
        if (!Pattern.matches(this.operation, operation)) {
            throw new InoutExceotion("사칙 연산자");// 보내진 문자열이 졍규식에 포함되있는지 확인
        }
        switch (operation) { // 연산자를 통해 연산할 클래스 선택
            case "+": // 연산자가 "+"일때 덧셈 연산을 하는 객체 인스턴스화
                this.calculator.setOperation(new addition());
                break;
            case "-":// 연산자가 "-"일때 뺄셈 연산을 하는 객체 인스턴스화
                this.calculator.setOperation(new subtraction());
                break;
            case "*":// 연산자가 "*"일때 곱셈 연산을 하는 객체 인스턴스화
                this.calculator.setOperation(new multiplication());
                break;
            case "/":// 연산자가 "/"일때 나눗셈 연산을 하는 객체 인스턴스화
                this.calculator.setOperation(new division());
                break;
        }
        return this;

    }

    //종료 메서드
    public void ExitSign(String sign) {
        if (sign.equals("exit")) { // exit문자열이 있는지 확인
            System.out.println("시스템 종료");
            System.exit(0); // 시스템 종료메서드 0은 문제없이 종료한다는 의미
        }
    }

    //출력 메서드
    public int execut() {
        return calculator.calculate();
    }

}

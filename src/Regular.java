import java.util.regex.Pattern;

import Four_Basic.*;

public class Regular {
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

    public Regular CheckSecondNum(String SecondNum) throws Exception {
        ExitSign(SecondNum);
        if (!Pattern.matches(number, SecondNum)) {
            throw new InoutExceotion("정수");
        }
        this.calculator.DTO.setSecondNumber(Integer.parseInt(SecondNum));

        return this;
    }

    public Regular CheckSign(String operation) throws Exception {
        ExitSign(operation);
        if (!Pattern.matches(this.operation, operation)) {
            throw new InoutExceotion("사칙 연산자");
        }
        switch (operation) {
            case "+":
                this.calculator.setOperation(new addition());
                break;
            case "-":
                this.calculator.setOperation(new subtraction());
                break;
            case "*":
                this.calculator.setOperation(new multiplication());
                break;
            case "/":
                this.calculator.setOperation(new division());
                break;
        }
        return this;

    }

    public void ExitSign(String sign) {
        if (sign.equals("exit")) {
            System.out.println("시스템 종료");
            System.exit(0);
        }
    }

    public int execut() {
        return calculator.calculate();
    }

}

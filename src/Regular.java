import java.util.regex.Pattern;
import Four_Basic.*;

public class Regular {
    private static final String operation = "[+\\-*/]";
    private static final String number = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Regular CheckFirstNum(String FirstNum) throws Exception{
        ExitSign(FirstNum);
        if(!Pattern.matches(number,FirstNum)) {
            throw new InoutExceotion("정수");
        }
        this.calculator.DTO.setFirstNumber(Integer.parseInt(FirstNum));

        return  this;
    }

    public Regular CheckSecondNum(String SecondNum) throws Exception{
        ExitSign(SecondNum);
        if(!Pattern.matches(number,SecondNum)) {
            throw new InoutExceotion("정수");
        }
        this.calculator.DTO.setSecondNumber(Integer.parseInt(SecondNum));

        return  this;
    }

    public Regular CheckSign(String operation) throws Exception{
        ExitSign(operation);
        if(!Pattern.matches(this.operation,operation))  {
            throw new InoutExceotion("사칙 연산자");
        }
        switch (operation){
            case "+" :
                this.calculator.setOperation(new addition());
                break;
            case "-" :
                this.calculator.setOperation(new subtraction());
                break;
            case "*" :
                this.calculator.setOperation(new multiplication());
                break;
            case "/" :
                this.calculator.setOperation(new division());
                break;
        }
        return this;

    }

    public void ExitSign(String sign) {
        if(sign.equals("exit")){
            System.out.println("시스템 종료");
            System.exit(0);
        }
    }

    public int execut(){
        return calculator.calculate();
    }

}

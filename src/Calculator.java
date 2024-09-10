import Four_Basic.operationing;

public class Calculator {
    DTO DTO = new DTO();

    private operationing operation;

    public Calculator() {

    }

    public Calculator(operationing o) {
        this.operation = o;
    }

    public void setOperation(operationing o) {
        this.operation = o;
    }

    public int calculate() {
        int number = 0;
        number = operation.operation(DTO.getFirstNumber(), DTO.getSecondNumber());
        return number;
    }

}

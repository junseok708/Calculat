import Four_Basic.operationing;

public class Calculator {
   //Getter & Setter을 담은 클레스
    DTO DTO = new DTO();

    //연산에 따른 연산 부모 클래스
    private operationing operation;

    //시랭을 위한 기본 연산자
    public Calculator() {

    }

    //연산자를 통해 연산을 바꾸는 메소드
    public void setOperation(operationing o) {
        this.operation = o;
    }

    //DTO에 담긴 숫자를 가져와 연산
    public int calculate() {
        int number = 0;
        number = operation.operation(DTO.getFirstNumber(), DTO.getSecondNumber());
        return number; // 연산한 값을 리턴
    }

}

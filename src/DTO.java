import org.w3c.dom.css.CSSImportRule;

public class  DTO {
    // 중요한 변수 캡슐화
    private int firstNumber=0;
    private int secondNumber=0;

    // 캡슐화한 변수을 활용하기 위한 Getter / Setter
    public int getFirstNumber(){
        return firstNumber;
    }

    public void setFirstNumber(int number){
        this.firstNumber = number;
    }

    public int getSecondNumber(){
        return secondNumber;
    }

    public void setSecondNumber(int number){
        this.secondNumber = number;
    }


}

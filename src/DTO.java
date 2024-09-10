import org.w3c.dom.css.CSSImportRule;

public class  DTO {
    private int firstNumber=0;
    private int secondNumber=0;
    private String algorithm="";


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

    public String getAlgorithm(){
        return algorithm;
    }

    public void setAlgorithm(String mark){
        this.algorithm = mark;
    }


}

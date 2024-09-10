public class InoutExceotion extends Exception{
    public InoutExceotion(String word) {
            super("==================\n"+word + "을 입력해주세요\n==================");

    }
}

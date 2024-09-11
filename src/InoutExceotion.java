public class InoutExceotion extends Exception{
    public InoutExceotion(String word) {
        // 예외 처리시 던져주는 word을 입력 받아 경고문 출력
            super("==================\n"+word + "을 입력해주세요\n==================");

    }
}

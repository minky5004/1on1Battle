package Champion;

public class Main {
    public static void main(String[] args) {
        // 챔피언 생성
        Steve steve = new Steve("Steve", 1, 1000, 50, 10);
        Paul paul = new Paul("Paul", 1, 1000, 50, 10);

        // 1:1 전투 시작
        SafeBattle.safeBattle(steve, paul);
    }
}
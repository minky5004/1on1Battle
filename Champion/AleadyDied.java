package Champion;

public class AleadyDied extends RuntimeException {
    public AleadyDied(String name) {
        super(name + "은 이미 죽었습니다.");
    }
}
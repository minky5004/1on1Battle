package Champion;

public class Paul extends Champion {

    public Paul(String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage, defense);
    }

    private int charge = 0;

    @Override
    public void leftHand(Champion champion, Champion target) {
        System.out.println("Paul의 잽");
        target.takeDamage(champion.getAttackDamage() - 20);
    }

    @Override
    public void rightHand(Champion champion, Champion target) {
        if (charge >= 3) {
            System.out.println("Paul의 붕권!");
            target.takeDamage(champion.getAttackDamage() * 2);
        } else {
            System.out.println("Paul의 정권!");
            target.takeDamage(champion.getAttackDamage() - 10);
        }
    }

    @Override
    public void leftKick(Champion champion, Champion target) {
        System.out.println("Paul의 로우킥");
        target.takeDamage(20);
    }

    @Override
    public void rightKick(Champion champion, Champion target) {
        System.out.println("Paul의 기모으기!.");
        this.charge++;
        System.out.println("기모으기 " + charge + " 단계");
    }

    @Override
    public void combo(Champion champion, Champion target) {
        System.out.println("Paul의 콤보");
        target.takeDamage(champion.getAttackDamage());
        target.takeDamage(champion.getAttackDamage());

    }

    @Override
    public void specialMove(Champion champion, Champion target) {
        if (charge >= 3) {
            System.out.println("Paul의 빅뱅 붕권!");
            target.takeDamage(champion.getAttackDamage() * 3);
        } else {
            System.out.println("special Move 실패!");
        }
    }
}
package Champion;

public class Steve extends Champion {

    public Steve(String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage,defense);
    }

    private boolean ducking = false;

    @Override
    public void leftHand(Champion champion, Champion target) {
        if (ducking) {
            System.out.println("Steve의 원투!");
            target.takeDamage(champion.getAttackDamage()+10);
            this.ducking = false;
        }else {
            System.out.println("Steve의 잽!");
            target.takeDamage(champion.getAttackDamage());
        }
    }

    @Override
    public void rightHand(Champion champion, Champion target) {
        if (ducking) {
            System.out.println("Steve의 소닉 블로우!");
            target.takeDamage(champion.getAttackDamage()+20);
            this.ducking = false;
        }else {
            System.out.println("Steve의 어퍼컷!");
            target.takeDamage(champion.getAttackDamage()+10);
        }
    }

    @Override
    public void leftKick(Champion champion, Champion target) {
        System.out.println("Steve는 위빙을 시작했다.");
        this.ducking = true;
    }

    @Override
    public void rightKick(Champion champion, Champion target) {
        System.out.println("Steve는 위빙을 시작했다.");
        this.ducking = true;

    }

    @Override
    public void combo(Champion champion, Champion target) {
        System.out.println("Steve의 연속타격");
        target.takeDamage(champion.getAttackDamage()/2);
        target.takeDamage(champion.getAttackDamage()/2);
        target.takeDamage(champion.getAttackDamage()/2);
    }

    @Override
    public void specialMove(Champion champion, Champion target) {
        System.out.println("Steve의 뎀프시롤");
        target.takeDamage(champion.getAttackDamage()/2);
        target.takeDamage(champion.getAttackDamage()/2);
        target.takeDamage(champion.getAttackDamage()/2);
        target.takeDamage(champion.getAttackDamage()/2);
        target.takeDamage(champion.getAttackDamage()/2);

    }

}

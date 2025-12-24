package Champion;

public class Paul extends Champion {

    public Paul (String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage,defense);
    }

    @Override
    public void leftHand(Champion champion, Champion target) {
        System.out.println("Paul의 LeftHand");
        target.takeDamage(champion.getAttackDamage()-20);
    }

    @Override
    public void rightHand(Champion champion, Champion target) {
        System.out.println("Paul의 RightHand!");
        target.takeDamage(champion.getAttackDamage()-10);
    }

    @Override
    public void leftKick(Champion champion, Champion target) {
        System.out.println("Paul의 LeftKick!");
    }

    @Override
    public void rightKick(Champion champion, Champion target) {
        System.out.println("Paul의 rightKick!.");
    }

    @Override
    public void combo(Champion champion, Champion target) {
        System.out.println("Steve의 콤보");
        target.takeDamage(champion.getAttackDamage()*2);

    }

    @Override
    public void specialMove(Champion champion, Champion target) {
        System.out.println("Paul의 붕권");
        target.takeDamage(champion.getAttackDamage()*2);

    }

}

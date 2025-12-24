package Champion;

public class Steve extends Champion {

    public Steve(String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage,defense);
    }

    @Override
    public void leftHand(Champion champion, Champion target) {
        System.out.println("Steve의 LeftHook!");
        target.takeDamage(champion.getAttackDamage()+10);
    }

    @Override
    public void rightHand(Champion champion, Champion target) {
        System.out.println("Steve의 RightHook!");
        target.takeDamage(champion.getAttackDamage()+20);
    }

    @Override
    public void leftKick(Champion champion, Champion target) {
        System.out.println("Steve는 발차기를 할 수 없습니다.");
    }

    @Override
    public void rightKick(Champion champion, Champion target) {
        System.out.println("Steve는 발차기를 할 수 없습니다.");
    }

    @Override
    public void combo(Champion champion, Champion target) {
        System.out.println("Steve의 콤보");
        target.takeDamage(champion.getAttackDamage()*2);

    }

    @Override
    public void specialMove(Champion champion, Champion target) {
        System.out.println("Steve의 뎀프시롤");
        target.takeDamage(champion.getAttackDamage()*2);

    }

    @Override
    public void guard(Champion champion, Champion target) {
        this.guardStance = true;
    }
}

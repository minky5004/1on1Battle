package Champion;

public class Steve extends Champion {

    public Steve(String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage,defense);
    }

    @Override
    public void leftHook(Champion champion, Champion target) {
        System.out.println("Steve의 LeftHook!");
        target.takeDamage(champion.getAttackDamage()-10);
    }

    @Override
    public void rightHook(Champion champion, Champion target) {
        System.out.println("Steve의 RightHook!");
        target.takeDamage(champion.getAttackDamage());
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
}

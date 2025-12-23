package Champion;

public abstract class Champion {

    String name;
    int level;
    int hp;
    int attackDamage;
    int defense;

    // 생성자
    public Champion(String name, int hp, int attackDamage, int defense) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    // 기본공격
    public void basicAttack(Champion champion, Champion target){
        System.out.println(this.name + "의 기본 공격");
        target.takeDamage(champion, this.attackDamage);
    }

    // 데미지 받기
    public void takeDamage(Champion champion, int damage){

        int realDamage = damage - defense;

        if (realDamage <= 0){
            realDamage = 0;
        }

        hp = hp - realDamage;

        if (hp > 0){
            System.out.println(name + "이" + realDamage + "의 피해를 받음. (남은 체력 : " + hp + ")");
        } else if (hp < 0) {
            System.out.println(name + "이 죽음.");
        }
    }

    public void levelUp(){
        System.out.println(name + "이 레벨업!");
        this.level++;
        hp += 100;
        attackDamage += 50;
        defense += 50;
    }


    public abstract void leftHook(Champion champion, Champion target);
    public abstract void rightHook(Champion champion, Champion target);
    public abstract void leftKick(Champion champion, Champion target);
    public abstract void rightKick(Champion champion, Champion target);
    public abstract void combo(Champion champion, Champion target);

}

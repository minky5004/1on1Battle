package Champion;

public class SafeBattle {

    public static void safeBattle(Champion A, Champion B) {
        System.out.println("\n===== 1:1 매치 시작: =====");
        System.out.println(  A.name + " vs " + B.name );
        System.out.println("========================");

        try {
            Action(A, B, "leftHand");
            Action(B, A, "rightHand");

            Action(A, B, "rightHand");
            Action(B, A, "leftKick");

            Action(A, B, "leftKick");
            Action(B, A, "rightKick");

            Action(A, B, "leftHand");
            Action(B, A, "rightKick");

            Action(A, B, "combo");
            Action(B, A, "combo");

            Action(B, A, "rightKick");
            Action(A, B, "specialMove");
            Action(B, A, "specialMove");

        } catch (AleadyDied e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== 전투 종료 =====");
        Result(A, B);
    }

    private static void Action(Champion attacker, Champion target, String skill) {
        if (attacker.hp <= 0) {
            throw new AleadyDied(attacker.name);
        }
        
        switch (skill) {
            case "leftHand": attacker.leftHand(attacker, target);
            break;
            case "rightHand": attacker.rightHand(attacker, target);
            break;
            case "leftKick": attacker.leftKick(attacker, target);
            break;
            case "rightKick": attacker.rightKick(attacker, target);
            break;
            case "combo": attacker.combo(attacker, target);
            break;
            case "specialMove": attacker.specialMove(attacker, target);
            break;
        }
        System.out.println("------------------------");
    }

    private static void Result(Champion A, Champion B) {
        if (A.hp > B.hp) System.out.println("승리: " + A.name);
        else if (A.hp < B.hp) System.out.println("승리: " + B.name);
        System.out.println(A.name + " 남은 체력: " + A.hp + " | " + B.name + " 남은 체력: " + B.hp);
    }
}


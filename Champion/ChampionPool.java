package Champion;

import java.util.*;

public class ChampionPool<T extends Champion>{

    private Map<String, T> pool = new HashMap<>();

    public void addChampion(T champion) {
        pool.put(champion.getName(), champion);
        System.out.println(champion.getName() + "이 게임에 참여하였습니다.");
    }

    public Optional<T> getChampion(String championName) {
        return Optional.ofNullable(pool.get(championName));
    }
}

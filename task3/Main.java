package task3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String... args) {
        Map<Integer, String> map = new HashMap<>();
        final Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            map.put(12, "Nikita");
            map.put(14, "Alim");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Set<Integer> set = new HashSet<>();
        increment(set);
        System.out.println(Arrays.toString(map.entrySet().toArray()));
        System.out.println(Arrays.toString(set.toArray()));
    }

    public static synchronized void increment(Set set) {
        set.add(14);
        set.add(15);
    }
}

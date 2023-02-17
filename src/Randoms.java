
import java.util.Iterator;

import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();

    public Randoms(int min, int max) {
        int diff =max -min;
        while (true) {
            int result = random.nextInt(diff + 1);
            result+=min;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return false;
            }


            @Override
            public Integer next() {
                return 0;
            }
        };
    }
}


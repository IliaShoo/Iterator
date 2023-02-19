
import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        int diff = max - min;
        while (true) {
            int result = random.nextInt(diff + 1);
            result += min;
            list.add(result);
            if (result == 100) {
                list.add(result);
                break;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                if (index < list.size()) {
                    return true;
                } else {
                    return false;
                }
            }


            @Override
            public Integer next() {
                if (index < list.size()) {
                    int number = list.get(index);
                    index++;
                    return number;
                }
                return 0;
            }
        };
    }
}


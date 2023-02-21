
import java.util.*;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    List<Integer> list = new LinkedList<>();

    public Randoms(int min, int max) {
        int diff = max - min;
        while (true) {
            int result = random.nextInt(diff + 1);
            result += min;
            list.add(result);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                if (!list.isEmpty()) {
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

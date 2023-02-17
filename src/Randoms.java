import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    public List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        int diff =max -min;
        while (diff !=0) {
            int result = random.nextInt(diff + 1);
            result+=min;
            list.add(result);
            diff--;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                if (index < list.size())
                    return true;
                return false;
            }


            @Override
            public Integer next() {
                if (index < list.size()) {
                    int number = list.get(index);
                    index++;
                    return number;
                } else {
                    return 0;
                }
            }
        };
    }
}


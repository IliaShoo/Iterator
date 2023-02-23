import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {

    private Random random = new Random();
    protected int min;
    protected int max;
    protected int diff;

    public RandomsIterator(int min, int max) {
        this.min = min;
        this.max = max;
        this.diff = max-min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return min + random.nextInt(diff+1);
    }
}

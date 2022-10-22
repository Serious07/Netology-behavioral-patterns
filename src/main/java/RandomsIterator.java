import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    protected Random rnd;
    protected int min;
    protected int max;

    public RandomsIterator(Random rnd, int min, int max){
        this.rnd = rnd;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return RandomHelper.getRandomNumberInRange(rnd, min, max, true);
    }
}

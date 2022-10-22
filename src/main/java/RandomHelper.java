import java.util.Random;

public class RandomHelper {
    public static Integer getRandomNumberInRange(Random rnd, int min, int max){
        return rnd.nextInt(max - min) + min;
    }

    public static Integer getRandomNumberInRange(Random rnd, int min, int max, boolean includeMax){
        return rnd.nextInt(max - min + (includeMax ? 1 : 0)) + min;
    }
}
package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random random;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}

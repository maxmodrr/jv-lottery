package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);

        return Colors.values()[index].name();
    }
}

package ComparableAndComparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // +ve -> this > other
        // -ve -> this < other
        // 0 -> this == other

        return  o2.getSpeed() - o1.getSpeed();
    }
}

package ComparableAndComparator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorClient {
    public static void main(String[] args) {

        //PriorityQueue<Car> pQ = new PriorityQueue<>(new CarComparator());
        PriorityQueue<Car> pQ = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        pQ.add(new Car(100, 50));
        pQ.add(new Car(50, 74));
        pQ.add(new Car(75, 100));


        while(!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}

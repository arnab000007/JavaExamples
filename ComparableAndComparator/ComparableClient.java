package ComparableAndComparator;

import java.util.PriorityQueue;

public class ComparableClient {
    public static void main(String[] args) {
        Car car1 = new Car(100, 50);
        Car car2 = new Car(200, 50);

        System.out.println(car1.compareTo(car2));

        PriorityQueue<Car> pQ = new PriorityQueue<>();

        pQ.add(new Car(100, 50));
        pQ.add(new Car(50, 74));
        pQ.add(new Car(75, 100));


        while(!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }

    }
}

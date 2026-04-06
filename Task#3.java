import java.util.ArrayList;
import java.util.Collections;

class OnlineStore {
    public static void main(String[] args) {

        
        ArrayList<Double> orders = new ArrayList<>();

        orders.add(200.0);
        orders.add(800.0);
        orders.add(6000.0);
        orders.add(450.0);
        orders.add(7200.0);
        orders.add(1500.0);

       
        orders.removeIf(order -> order < 500);

    
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) > 5000) {
                double discounted = orders.get(i) * 0.9;
                orders.set(i, discounted);
            }
        }

        double total = 0;
        for (double order : orders) {
            total += order;
        }

        Collections.sort(orders);

   
        System.out.println("Sorted Orders: " + orders);
        System.out.println("Total Revenue: " + total);
    }
}
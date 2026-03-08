import java.util.*;

public class TASK3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> orders = new ArrayList<>();

        System.out.print("How many orders? ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter order value: ");
            orders.add(sc.nextDouble());
        }

        // Remove orders below 500
        orders.removeIf(order -> order < 500);

        // Apply 10% discount
        for(int i=0;i<orders.size();i++){
            if(orders.get(i) > 5000)
                orders.set(i, orders.get(i) * 0.9);
        }

        double total = 0;

        for(double o : orders)
            total += o;

        Collections.sort(orders);

        System.out.println("Sorted Orders: " + orders);
        System.out.println("Total Revenue: " + total);
    }
}
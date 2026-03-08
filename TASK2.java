import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] temp = new double[5][7];

        int feverCount = 0;
        double highestAvg = 0;
        int patient = 0;

        for(int i = 0; i < 5; i++){

            double sum = 0;

            System.out.println("Enter temperatures for Patient " + (i+1));

            for(int j = 0; j < 7; j++){

                temp[i][j] = sc.nextDouble();

                if(temp[i][j] < 95)
                    temp[i][j] = 95;

                if(temp[i][j] > 100)
                    feverCount++;

                sum += temp[i][j];
            }

            double avg = sum / 7;

            System.out.println("Average of Patient " + (i+1) + ": " + avg);

            if(avg > highestAvg){
                highestAvg = avg;
                patient = i + 1;
            }
        }

        System.out.println("Patient with highest weekly average: " + patient);
        System.out.println("Temperature exceeded 100°F: " + feverCount + " times");
    }
}
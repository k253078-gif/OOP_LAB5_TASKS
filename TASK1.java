import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[12];
        int sum = 0;

        System.out.println("Enter marks of 12 students:");

        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();

            if(marks[i] < 40)
                marks[i] = 40;   // Grace marks
        }

        for(int m : marks)
            sum += m;

        double average = sum / (double)marks.length;

        int full = 0, half = 0, none = 0, belowAvg = 0;

        for(int m : marks){

            if(m > 85)
                full++;
            else if(m >= 70)
                half++;
            else
                none++;

            if(m < average)
                belowAvg++;
        }

        System.out.println("Class Average: " + average);
        System.out.println("Full Scholarship: " + full);
        System.out.println("Half Scholarship: " + half);
        System.out.println("No Scholarship: " + none);
        System.out.println("Students below average: " + belowAvg);
    }
}
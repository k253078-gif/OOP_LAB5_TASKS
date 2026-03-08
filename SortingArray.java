import java.util.Arrays;

public class SortingArray {
        public static void main(String[] args) {

            String[] names = {"Talal","Arham", "Muhammad Wasi", "Rayyan", "Ali"};
            Arrays.sort(names);
            System.out.println("Sorted Names:");

            for(String name : names){
                System.out.println(name);
            }
        }
    }

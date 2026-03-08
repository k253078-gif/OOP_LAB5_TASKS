/*can non-static methods access static fields
  Yes, non-static methods can access static fields because static fields belong to the class
  and are shared by all objects of that class.*/

//What are jagged arrays?
// those arrays which do not have same no.of columns in all rows are known as jagged array

//Union and intersection of two arrays

import java.util.HashSet;
import java.util.Set;

public class ClassQuestions {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1)
            unionSet.add(num);
        for (int num : arr2)
            unionSet.add(num);

        System.out.println("Union: " + unionSet);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr1)
            intersectionSet.add(num);
        Set<Integer> arr2Set = new HashSet<>();
        for (int num : arr2)
            arr2Set.add(num);
        intersectionSet.retainAll(arr2Set);

        System.out.println("Intersection: " + intersectionSet);
    }
}


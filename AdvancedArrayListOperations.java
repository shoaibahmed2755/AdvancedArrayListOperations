package program1.java;

import java.util.ArrayList;
import java.util.Collections;

public class AdvancedArrayListOperations {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding initial elements to the ArrayList
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6);
        System.out.println("Original ArrayList:");
        System.out.println(numbers);
        
        // Removing an element by value
        numbers.remove(Integer.valueOf(4));
        System.out.println("ArrayList after removing 4:");
        System.out.println(numbers);
        
        // Sorting the ArrayList in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList:");
        System.out.println(numbers);
        
        // Sorting the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("ArrayList sorted in reverse order:");
        System.out.println(numbers);
        
        // Converting ArrayList to Array
        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        System.out.println("Array obtained from ArrayList:");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Additional feature: Finding the maximum and minimum values
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Maximum value in the ArrayList: " + max);
        System.out.println("Minimum value in the ArrayList: " + min);
        
        // Additional feature: Shuffling the ArrayList
        Collections.shuffle(numbers);
        System.out.println("Shuffled ArrayList:");
        System.out.println(numbers);
    }
}

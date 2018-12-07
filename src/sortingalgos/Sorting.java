package sortingalgos;

import sortingalgos.algos.BubbleSort;
import sortingalgos.algos.InsertionSort;
import sortingalgos.algos.SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Sorting class to sort 5 numbers
 *
 * @author vipul
 */
public class Sorting {
    private static final int NO_OF_ENTRIES = 5;

    public static void main(final String[] args) {
        System.out.println("Take Input from User");
        final List<Integer> inputFromUser = new ArrayList<>();

        for (int i = 0; i < NO_OF_ENTRIES; i++) {
            final Scanner s = new Scanner(System.in);
            inputFromUser.add(Integer.parseInt(s.nextLine()));
        }
        System.out.println("Before Sorting: ");
        final SortingAlgorithms sortingAlgorithmsBubbleSort = new BubbleSort();
        //final SortingAlgorithms sortingAlgorithmsInsertionSort = new InsertionSort();
        inputFromUser.forEach(value -> System.out.println(value));
        sortingAlgorithmsBubbleSort.sort(inputFromUser);
        //sortingAlgorithmsInsertionSort.sort(inputFromUser);
        System.out.println("After Sorting: ");
        inputFromUser.forEach(value -> System.out.println(value));
    }




}

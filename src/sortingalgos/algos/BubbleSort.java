package sortingalgos.algos;

import sortingalgos.utilities.Utilities;

import java.util.List;

/**
 * Sorting the list using bubble sort
 *
 * @author vipul
 */
public final class BubbleSort implements SortingAlgorithms{

    @Override
    public void sort(List<Integer> numbers) {
        for (int numberOfIterations = numbers.size(); numberOfIterations > 0; numberOfIterations --) {
            for (int i = 0, j = 1; j < numberOfIterations; ++i, ++j) {
                if (numbers.get(i) > numbers.get(j)) {
                    Utilities.swap(i, j, numbers);
                }
            }
        }
    }
}

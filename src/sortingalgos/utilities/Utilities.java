package sortingalgos.utilities;

import java.util.List;

/**
 * Class to be used for general function such as swapping
 *
 * @author vipul
 */
public final class Utilities {

    /**
     * This function swaps values at index i amd j in the passed list
     * @param i first index
     * @param j second index
     * @param nums the list in which swapping needs to be done
     */
    public static void swap(final Integer i, final Integer j, final List<Integer> nums) {
        // in list value at i should be swapped with value at j
        final int valueAtI = nums.get(i);
        final int valueAtJ = nums.get(j);
        nums.set(i, valueAtJ);
        nums.set(j, valueAtI);
    }
}

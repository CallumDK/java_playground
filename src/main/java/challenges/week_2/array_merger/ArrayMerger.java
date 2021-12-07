package challenges.week_2.array_merger;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayMerger {


    public static int[] merger(int[] arr1, int[] arr2){
        int aLength = arr1.length;
        int bLength = arr2.length;
        int[] mergedArr = new int[aLength + bLength];

        for (int i = 0; i < aLength; i++){
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < bLength; i++){
            mergedArr[i + aLength] = arr2[i];
        }
        return mergedArr;
    }

    public static int[] sortAsc(int[] toSort){
        // Could use the BubbleSort logic here, but it's not very efficient
        Arrays.sort(toSort);
        return toSort;
    }

    public static int[] sortDesc(int[] toSort){
        Arrays.sort(toSort);
        int[] descending = new int[toSort.length];
        int j = toSort.length;
        for (int i = 0; i < toSort.length; i++){
            descending[j - 1] = toSort[i];
            j--;
        }
        return descending;
    }

    /*
    public static int[] removeDuplicates(int[] arr){
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
        int[] dupesRemoved = new int[linkedHashSet.size()];
        for(Integer i : linkedHashSet){
            dupesRemoved[i] = i;
        }
        return dupesRemoved;
    }
     */



    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1, 0};


        int[] result = merger(a, b);

        System.out.println(Arrays.toString(result));

        int[] resultTwo = sortAsc(result);

        System.out.println(Arrays.toString(resultTwo));

        int[] resultThree = sortDesc(result);
        System.out.println(Arrays.toString(resultThree));

        //int[] resultFour = removeDuplicates(result);
        //System.out.println(Arrays.toString(resultFour));


    }



}

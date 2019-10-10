package insertion_sort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = new int[6];
        intArray[0] = 25;
        intArray[1] = 52;
        intArray[2] = 36;
        intArray[3] = 85;
        intArray[4] = 11;
        intArray[5] = 15;

        int[] sortedArray = insertionSort(intArray);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] insertionSort(int[] intArray) {

        for (int i = 1; i < intArray.length; i++) {

            int element = intArray[i];
            int j = i - 1;

            while (j >= 0 && intArray[j] > element) {
                intArray[j + 1] = intArray[j];
                j--;
            }
            intArray[j + 1] = element;
        }
        return intArray;
    }
}

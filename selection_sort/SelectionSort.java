package selection_sort;

public class SelectionSort {

    public static void main(String[] args){

        int[] intArray = new int[6];
        intArray[0] = 25;
        intArray[1] = 52;
        intArray[2] = 36;
        intArray[3] = 85;
        intArray[4] = 11;
        intArray[5] = 15;

        int[] sortedArray = selectionSort(intArray);

        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static int[] selectionSort(int[] intArray){
        for (int i = 0; i < intArray.length; i++){

            int minimum = i;

            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[j] < intArray[minimum])
                    minimum = j;
            }

            swap(intArray, i, minimum);
        }
        return intArray;
    }

    public static void swap(int[] intArray, int i, int j){

        if(i == j)
            return;

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

}

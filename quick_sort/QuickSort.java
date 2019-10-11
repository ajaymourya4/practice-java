package quick_sort;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = {25,52,36,85,11,15};

        quickSort(intArray, 0, intArray.length-1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] intArray, int start, int end) {
        if (start < end){
            int p = partition(intArray, start, end);
            quickSort(intArray, start, p-1);
            quickSort(intArray, p+1, end);
        }
    }

    // gives index position of correctly placed pivot value
    public static int partition(int[] intArray, int start, int end) {

        int pivot = intArray[end];
        int i = start - 1;

        for (int j = start; j <= end-1; j++ ){
            if (intArray[j] <= pivot){
                i++;
                swap(intArray, i,j);
            }
        }

        //put the pivot value in correct slot
        int ival = intArray[i + 1];
        intArray[end] = ival;
        intArray[i + 1] = pivot;

        return i+1;
    }

    public static void swap(int[] intArray, int i, int j){

        if(i == j)
            return;

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}

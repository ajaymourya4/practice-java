package merge_sort;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = new int[6];
        intArray[0] = 25;
        intArray[1] = 52;
        intArray[2] = 36;
        intArray[3] = 85;
        intArray[4] = 11;
        intArray[5] = 15;

        Sort(intArray, 0, intArray.length-1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void Sort(int[] intArray, int start, int end) {

        if(end <= start)
            return;

        int mid = (start + end)/2;
        Sort(intArray, start, mid);
        Sort(intArray, mid+1, end);

        Merge(intArray, start, mid, end);
    }

    public static void Merge(int[] intArray, int start, int mid, int end) {

        int[] tempArray = new int[end - start + 1];

        int leftSlot = start;
        int rightSlot = mid + 1;
        int k = 0;

        while (leftSlot <= mid && rightSlot <= end) {
            if (intArray[leftSlot] < intArray[rightSlot]){
                tempArray[k] = intArray[leftSlot];
                leftSlot++;
                k++;
            }else{
                tempArray[k] = intArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        while (leftSlot <= mid){
            tempArray[k] = intArray[leftSlot];
            leftSlot++;
            k++;
        }

        while (rightSlot <= end){
            tempArray[k] = intArray[rightSlot];
            rightSlot++;
            k++;
        }

        for(int i = 0; i < tempArray.length; i++){
            intArray[start+i] = tempArray[i];
        }
    }
}

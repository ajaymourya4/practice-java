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


        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest])
                    largest = i;
            }

            swap(intArray,lastUnsortedIndex,largest );

        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] intArray, int i, int j){

        if(i == j)
            return;

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

}

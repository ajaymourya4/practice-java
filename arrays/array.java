package arrays;

public class array {

    public static void main(String[] args){

        int[] myArray = new int[10];
        myArray[0] = 25;
        myArray[1] = 52;
        myArray[2] = 36;
        myArray[3] = 85;
        myArray[4] = 11;
        myArray[5] = 15;

        System.out.println("Capacity " + capacity(myArray));

        System.out.println("Size " + size(myArray));

    }

    public static int capacity(int[] myArray){
        return myArray.length;
    }

    public static int size(int[] myArray){
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != 0)
                count++;
        }
        return count;
    }
}

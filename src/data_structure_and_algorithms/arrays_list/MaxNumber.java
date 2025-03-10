package data_structure_and_algorithms.arrays_list;

public class MaxNumber {
    public static void main(String[] args) {
        int arr[] = {1,200,100,50,300};
        int maxNumber = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (maxNumber < arr[i]){
                maxNumber = arr[i];
            }
        }

        System.out.println("Max number is " + maxNumber);
    }
}

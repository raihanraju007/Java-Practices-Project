package data_structure_and_algorithms.arrays_list;

public class FindNumber {
    public static void main(String[] args) {
        int arr[] = {1,200,8,20,10};
        int lookFor = 8;

        boolean isPresent = false;
        for (int i = 0; i< arr.length && isPresent == false; i++){
            if (arr[i] == lookFor){
                isPresent = true;
                System.out.println(isPresent);
            }
        }
        if (isPresent){
            System.out.println( lookFor + " is found\n");
        }else {
            System.out.println(lookFor + " is not found \n");
        }
    }

}
// O(n) = O(5)

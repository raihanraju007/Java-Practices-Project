package data_structure_and_algorithms.arrays_list;

public class SearchNumberBinarySearch {
    public static void main(String[] args) {
        int arr[] = {12,14,20,34,45,66,89,101};
        int lookFor = 89;
        int count = 0;
        boolean isPresent = false;

        //Array Index
        int low = 0, high = 7;
//      how many time run my code
        while (low <= high ){
            count ++;
//            int mid = (high - low) / 2 + low;
            int mid = (high + low) / 2;
            if (arr[mid] == lookFor){
                isPresent = true;
                break;
            }
            if (arr[mid] > lookFor){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        if (isPresent){
            System.out.println( lookFor + " found" );
        }else {
            System.out.println(lookFor + "not found");
        }
        System.out.println(" number of operation need " +count);
    }
}

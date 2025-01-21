package arrays;

public class BasicArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("---------------------------------------------------------------------------------------");

//        Array Declaration
        int raju[];
        int[] numbers;


//        Create an Array
        numbers = new int[5];

//        Access an Element of an Array
        // Setting the first element of the array
        numbers[0] = 10;

        // Accessing the first element
        int firstElement = numbers[0];
        System.out.println(firstElement);
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        // Changing the first element to 20
        numbers[0] = 20;
        for (int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");

        // Declaring array literal
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};


        // A single-dimensional array
        int[] singleDimArray ={1,2,3,4,5};

//        Multi-Dimensional Arrays
        // A 2D array (matrix)
        int[][] multiDimArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i < multiDimArray.length; i++){
            for (int j = 0; j < multiDimArray[i].length; j++){
                System.out.print(multiDimArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}

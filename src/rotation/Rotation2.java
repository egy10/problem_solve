package rotation;

public class Rotation2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6}; //initialize array
        int k = 2;
        System.out.println("Orginal array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < k; i++) { //Rotate the given array by n times
            int j, last;
            last = arr[arr.length - 1]; // stores the last element of array
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1]; // shift element of array by one
            }
            arr[0] = last; //last element of array will be added to the start of array
        }
        System.out.println();
        System.out.println("Array after right rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

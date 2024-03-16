package Seminar2;

public class Task3  {
    public static void main(String[] args) {
        int[] arr1 = {21, 19, 0, 0, 6, 9, 101, 96, 5};
        int[] arr2 = {21, 19, 2, 0, 6, 9, 101, 96, 5};
        System.out.println(hasZeroNeighbors(arr1));
        System.out.println(hasZeroNeighbors(arr2));
    }
    public static boolean hasZeroNeighbors(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {

                return true;
            }
        }

        return false;
    }

}


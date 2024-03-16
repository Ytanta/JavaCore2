package Seminar2;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {21, 19, 8, 12, 6, 9, 101, 96, 5};
        System.out.println(countEven(arr));
    }
    static  int countEven (int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

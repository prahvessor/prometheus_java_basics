public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        int step = length / 2;
        while (step > 0) {
            for (int i = 0; i < (length - step); i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + step]){

                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
} 
public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int index = -1;

        for (int i = 0; i < data.length; i++) {
            if ( data[i] == numberToFind) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

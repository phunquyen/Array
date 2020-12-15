import java.util.Arrays;

public class MyArray {
    int[] arr = new int[10];
    int i = 0;

    public void add(int number) {
        if(isFullSize()) {
            int[] temp = new int[arr.length];
            copy(arr, temp);
            arr = new int[arr.length + (arr.length / 2)];
            copy(temp,arr);
        }
        arr[i] = number;
        i++;
    }

    public void copy(int[] from, int[] to) {
        for (int j = 0; j < from.length; j++) {
            to[j] = from[j];
        }
    }
    public boolean isFullSize() {
        return arr.length == i;
    }

    public int getElement(int index) {
        int element = 0;
        for (int j = 0; j < arr.length; j++) {
            if(j == index) {
                element = arr[j];
                break;
            }
        }
        return element;
    }

    public void remove(int index) {
        for (int j = 0; j < arr.length; j++) {
            if(j > index) {
                arr[j-1] = arr[j];
            }
        }
        arr[arr.length - 1] = 0;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

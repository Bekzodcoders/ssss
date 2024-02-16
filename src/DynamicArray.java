import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    static Scanner scanner = new Scanner(System.in);
    private int capacity;
    static private int[] array = {4, 5, 7, 3, 8, 4, 14, 5, 51, 9};
    private int size = array.length;

    public void removeByElement(){
        System.out.println(Arrays.toString(array));
        System.out.println("Qaysi sonni o'chiray...");
        int n = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == n) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                break;
            }
        }
        show();
    }
    public void removeAll(){
        System.out.println(Arrays.toString(array));
        System.out.println("Qaysi son arraydan ochsin.");
        int son = scanner.nextInt();

        System.out.println("O'chiriladigan son: " + son);

        for (int i = 0; i < size; i++) {
            if (array[i] == son) {
                for (int j = i + 1; j < size; j++) {
                    array[j-1] = array[j];
                }
                array[size-1] = 0;
                size--;
                i--;
            }
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int get(int index) {
        return array[index];
    }

    public void remove() {
        System.out.println("Qaysi indexni o'chiray...");
        System.out.println(Arrays.toString(array));
        int index = scanner.nextInt()-1;
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("o'chirildi!");
        size--;
        show();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        System.out.println("Tozalandi");
    }

    public int size() {
        return size;
    }
    public void show() {
        System.out.print("Array elements: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    public void grow(){
        int newlen = array.length +array.length/2+1;
        Integer[] newArray = new Integer[newlen];
        System.arraycopy(array ,0, newArray,0,size);
    }

}

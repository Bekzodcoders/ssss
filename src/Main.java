import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("Dasturga xush kelibsiz...");
        while (true){
            DisplayMenu();
            System.out.println("Tanlang...");
            int x = scanner.nextInt();
            switch (x){
                case 1 -> dynamicArray.removeByElement();
                case 2 -> dynamicArray.removeAll();
                case 3 -> dynamicArray.remove();
                case 4 -> dynamicArray.isEmpty();
                case 5 -> dynamicArray.clear();
                case 6 -> dynamicArray.size();
                case 7 -> dynamicArray.show();
                case 8 -> dynamicArray.grow();
            }
        }
    }

    private static void DisplayMenu() {
        System.out.println("""
                1 - removeByElement
                2 - removeAll
                3 - remove
                4 - isEmpty
                5 - clear
                6 - size
                7 - show
                9 - grow
                """);
    }
}

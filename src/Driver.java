import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of words: ");
        int count = scanner.nextInt();
        for(int i = 0; i < count ; i++){
            System.out.println("Enter Word: ");
            String word = scanner.next();
            words.addWord(word);
        }
        words.bubbleSort();
    }
}
package Day1IQ;
import java.util.Scanner;

public class checkVowelCons{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scanner.next().toLowerCase().charAt(0);

        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        }
    }
   public static boolean isVowel(char ch) {
        
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
package Week10Problem.class_problems;
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        int vowels= 0;
        int consonants= 0;

        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            
        }
        System.out.println("----------------------------------");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}

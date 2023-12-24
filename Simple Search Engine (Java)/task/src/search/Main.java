package search;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scFile = new Scanner(args[0]);
        Scanner sc = new Scanner(System.in);
        ArrayList <String> words = new ArrayList<>();
        while (sc.hasNext()){
            words.add(sc.next());
        }
        int menu = -1;
        while (menu != 0) {
            System.out.println("""
                === Menu ===
                1. Find a person
                2. Print all people
                0. Exit""");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1 :
                        search(sc,words);
                        break;
                case 2 : printAll(words);
                        break;
                case 0 :
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Incorrect option! Try again.");
                    break;
            }

        }

    }




    static void printAll(ArrayList<String> strings) {

        if (strings != null) {
            System.out.println("\n=== List of people ===");
            for (String word : strings){
                System.out.println(word);
            }
        }
    }
    public static void search(Scanner sc, ArrayList<String> words) {
        boolean result = false;
        System.out.println("Enter data to search people:");
        String search = sc.nextLine();
        for (String word: words){
            if (word.toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Found people:");
                System.out.println(word);
                result = true;
            }
        }
        if (!result){
            System.out.println("No matching people found.");
        }

    }
}




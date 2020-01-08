package task_5_3;

import java.util.Scanner;

public class run {


    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter eng word");
        String eng = scanner.nextLine();
        System.out.println("Enter translate on rus");
        String rus = scanner.nextLine();
        dictionary.addWord(eng,rus);
        dictionary.getTranslate("stas");
        System.out.println(dictionary.getWords());
    }
}

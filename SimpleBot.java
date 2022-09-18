package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Alfred", "2022");
        remindName();
        guessAge();
        count();
        test();
        end();
    }//end of main

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }//end of greet

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }//end of remindName

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }//end of guessAge

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }//end of count

    static void test() {
        int ch = 0;
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Who was the first computer programmer?\n 1. Charles Babbage \n 2. Ada Lovelace \n 3. Alan Turing \n 4. Steve");
        while (ch != 2){
            ch = scanner.nextInt();
            System.out.println("Wrong answer,try again.");
        }
    }//end of test
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }//end of end
}//class end

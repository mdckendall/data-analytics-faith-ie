import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Main {
    public static void main(String[] args) {
        doThing();
    }

    public static void doThing() {
        while (true) {
            System.out.println("Press 1 to learn about salary.\nPress 2 to learn about the job.\nPress 3 to learn about demand.\nPress 4 to view current students.\nPress 5 to quit.");
            Scanner choiceScanner = new Scanner(System.in);
            int in = choiceScanner.nextInt();
            switch (in) {
                case 1:
                    System.out.println("$98,345 average salary in South Florida!");
                    break;
                case 2:
                    System.out.println("US News - 100 Best Jobs!");
                    break;
                case 3:
                    System.out.println("Top 10 Forbes In-Demand Jobs!");
                    break;
                case 4:
                    try {
                        FileReader fr = new FileReader("names.txt");
                        Scanner fileScanner = new Scanner(fr);
                        while (fileScanner.hasNext()) {
                            System.out.println(fileScanner.nextLine());
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
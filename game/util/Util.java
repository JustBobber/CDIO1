package game.util;

public class Util {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void welcomeLineOne() {
        System.out.println("");
        System.out.println(" /$$      /$$           /$$                                             ");
        System.out.println("| $$  /$ | $$          | $$                                             ");
        System.out.println("| $$ /$$$| $$  /$$$$$$ | $$  /$$$$$$$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$  ");
        System.out.println("| $$/$$ $$ $$ /$$__  $$| $$ /$$_____/ /$$__  $$| $$_  $$_  $$ /$$__  $$ ");
        System.out.println("| $$$$_  $$$$| $$$$$$$$| $$| $$      | $$  \\ $$| $$ \\ $$ \\ $$| $$$$$$$$ ");
        System.out.println("| $$$/ \\  $$$| $$_____/| $$| $$      | $$  | $$| $$ | $$ | $$| $$_____/ ");
        System.out.println("| $$/   \\  $$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$/| $$ | $$ | $$|  $$$$$$$ ");
        System.out.println("|__/     \\__/ \\_______/|__/ \\_______/ \\______/ |__/ |__/ |__/ \\_______/ ");
        System.out.println("");
    }

    public static void welcomeLineTwo() {
        print("");
        print(" /$$$$$$$$$$$$$$                               ");
        print(" |_____ $$_____/                               ");
        print("      | $$   /$$$$$$                           ");
        print("      | $$  /$$__  $$                          ");
        print("      | $$ | $$  \\ $$                         ");
        print("      | $$ | $$  | $$                          ");
        print("      | $$ |  $$$$$$/                          ");
        print("      |___/\\______/                                           Dice Game");
        print("");
    }

}

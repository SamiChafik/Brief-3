import java.util.Scanner;

public class Menu {

    public void menu(){
        System.out.println("════════  Menu  ════════");
        System.out.println("1 - creat a user");
        System.out.println("2 - display users");
        System.out.println("3 - find a user");
        System.out.println("4 - modify a user");
        System.out.println("5 - delete a user");
        System.out.println("0 - exit");
        System.out.println("════════ ══════ ════════");
    }

    public short choice(){
        System.out.print("=> ");
        Scanner sc = new Scanner(System.in);
        short ch = sc.nextShort();
        return ch;
    }
}

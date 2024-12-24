import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void add(){

        System.out.print("User ID : ");
        String id = sc.nextLine();
        System.out.print("User name : ");
        String name = sc.nextLine();
        System.out.print("User age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("User phone : ");
        String tel = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.print("Password");
        String password = sc.nextLine();

        users.add(new User(id, name, age, tel, email, password));

    }

    public void show(){

        if (users.isEmpty()){
            System.out.println("there are no users !");
            return;
        }

        for (User user : users){
            System.out.println(user);
        }
    }

    public void delete(){

        if (users.isEmpty()){
            System.out.println("there are no users !");
            return;
        }
        users.clear();
        System.out.println("all users are deleted !");
    }

}

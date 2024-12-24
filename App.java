import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("════════  Menu  ════════");
        System.out.println("1 - create a user");
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
        return sc.nextShort();
    }

    public void add(){

        System.out.print("User ID : ");
        String id = sc.nextLine();
        System.out.print("User Personal name : ");
        String p_name = sc.nextLine();
        System.out.print("User Family name : ");
        String f_name = sc.nextLine();
        System.out.print("User age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("User phone : ");
        String tel = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();

        users.add(new User(id, p_name, f_name, age, tel, email, password));

    }

    public void show(){

        if (users.isEmpty()){
            System.out.println("there are no users !");
            return;
        }

        System.out.println("== List of users ==");
        for (User user : users){
            System.out.println("______________");
            System.out.println(user);

        }
    }

    public void find(){

        if (users.isEmpty()){
            System.out.print("there are no users !");
            return;
        }

        ArrayList<User> found = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("find a user (by ID,personal/family Name,phone number,Email) : ");
        String search = sc.nextLine();

        for (User user : users){
            if (search.equals(user.getID()) || search.equalsIgnoreCase(user.getP_Name()) || search.equalsIgnoreCase(user.getF_Name()) ||
            search.equalsIgnoreCase(user.getTel()) || search.equalsIgnoreCase(user.getEmail())){

                found.add(user);
            }
        }

        if (found.isEmpty()) {
            System.out.println("No users found !");
        }else {
            System.out.println("== Users found ==");
            for (User user : found){
                System.out.println(user);
            }
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

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Colors color = new Colors();

    public void menu(){
        System.out.println(color.red+color.bold+"════════  Menu  ════════"+color.white);
        System.out.println("1 - create a user");
        System.out.println("2 - display users");
        System.out.println("3 - find a user");
        System.out.println("4 - modify a user");
        System.out.println("5 - delete a user");
        System.out.println("0 - exit");
        System.out.println(color.red+"════════ ══════ ════════"+color.white);
    }

    public short choice(){
        System.out.print(color.blue+"=> "+color.white);
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
        System.out.print("User role (Admin - Employee - client) : ");
        String role = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();


        Role varRole = new Role(role);
        users.add(new User(id, p_name, f_name, age, tel, email, password, varRole));

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

    public void modify(){

        if (users.isEmpty()){
            System.out.print("there are no users !");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre user ID you want to modify : ");
        String id = sc.nextLine();


        for(User user : users) {
            if (id.equals(user.getID())) {
                System.out.println("== User found ==");
                System.out.println(user);

                System.out.println("what do you want to modify :");
                System.out.println("1 - Personal Name");
                System.out.println("2 - Family Name");
                System.out.println("3 - Age");
                System.out.println("4 - Phone number");
                System.out.println("5 - Role");
                System.out.println("6 - Email");
                System.out.println("7 - Password");
                System.out.println("0 - Return");
                System.out.print("=> ");
                int ch = sc.nextShort();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("New personal name : ");
                        user.setP_Name(sc.nextLine());
                        System.out.println("Updated !");
                        break;
                    case 2:
                        System.out.print("New Family name : ");
                        user.setF_Name(sc.nextLine());
                        System.out.println("Updated !");
                        break;
                    case 3:
                        System.out.print("New age : ");
                        user.setAge(sc.nextInt());
                        System.out.println("Updated !");
                        break;
                    case 4:
                        System.out.print("New phone number : ");
                        user.setTel(sc.nextLine());
                        System.out.println("Updated !");
                        break;
                    case 5 :
                        System.out.print("New Role : ");
                        String role = sc.nextLine();
                        Role newRole = new Role(role);
                        user.setRole(newRole);

                        System.out.println("Updated");
                        break;
                    case 6:
                        System.out.print("New Email : ");
                        user.setEmail(sc.nextLine());
                        System.out.println("Updated !");
                        break;
                    case 7:
                        System.out.print("New password : ");
                        user.setPassword(sc.nextLine());
                        System.out.println("Updated !");
                        break;
                    case 0:
                        break;
                }
            } else System.out.println("User doesnt exist !");
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

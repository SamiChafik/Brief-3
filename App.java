import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<User> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Colors color = new Colors();

    public void menu(){
        System.out.println(color.red+color.bold+"════════  Menu  ════════"+color.white);
        System.out.println("1 - Create a user");
        System.out.println("2 - Display users");
        System.out.println("3 - Find a user");
        System.out.println("4 - Modify a user");
        System.out.println("5 - Delete a user");
        System.out.println(color.green+"0 - Exit");
        System.out.println(color.red+"════════ ══════ ════════"+color.white);
    }

    public short choice(){
        System.out.print(color.blue+color.bold+"=> "+color.white);
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
            System.out.println(color.red+"there are no users !"+color.white);
            return;
        }

        System.out.println(color.yellow+"== List of users =="+color.white);
        for (User user : users){
            System.out.println(color.green+"______________"+color.white);
            System.out.println(user);
            System.out.println(color.green+"______________"+color.white);

        }
    }

    public void find(){

        if (users.isEmpty()){
            System.out.println(color.red+"there are no users !"+color.white);
            return;
        }

        ArrayList<User> found = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(color.cyan+"find a user (by ID,personal/family Name,phone number,Email) : "+color.white);
        String search = sc.nextLine();

        for (User user : users){
            if (search.equals(user.getID()) || search.equalsIgnoreCase(user.getP_Name()) || search.equalsIgnoreCase(user.getF_Name()) ||
            search.equalsIgnoreCase(user.getTel()) || search.equalsIgnoreCase(user.getEmail())){

                found.add(user);
            }
        }

        if (found.isEmpty()) {
            System.out.println(color.red+"No users found !"+color.white);
        }else {
            System.out.println(color.green+"== Users found =="+color.white);
            for (User user : found){
                System.out.println(user);
            }
        }
    }

    public void modify(){

        if (users.isEmpty()){
            System.out.println(color.red+"there are no users !"+color.white);
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print(color.cyan+"Entre user ID you want to modify : "+color.white);
        String id = sc.nextLine();


        for(User user : users) {
            if (id.equals(user.getID())) {
                System.out.println(color.green+"== User found =="+color.white);
                System.out.println(user);

                System.out.println(color.cyan+"what do you want to modify :"+color.white);
                System.out.println("1 - Personal Name");
                System.out.println("2 - Family Name");
                System.out.println("3 - Age");
                System.out.println("4 - Phone number");
                System.out.println("5 - Role");
                System.out.println("6 - Email");
                System.out.println("7 - Password");
                System.out.println(color.green+"0 - Return");
                System.out.print(color.blue+"=> "+color.white);
                int ch = sc.nextShort();
                sc.nextLine();

                switch (ch) {
                    case 1:
                        System.out.print("New personal name : ");
                        user.setP_Name(sc.nextLine());
                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 2:
                        System.out.print("New Family name : ");
                        user.setF_Name(sc.nextLine());
                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 3:
                        System.out.print("New age : ");
                        user.setAge(sc.nextInt());
                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 4:
                        System.out.print("New phone number : ");
                        user.setTel(sc.nextLine());
                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 5 :
                        System.out.print("New Role : ");
                        String role = sc.nextLine();
                        Role newRole = new Role(role);
                        user.setRole(newRole);

                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 6:
                        System.out.print("New Email : ");
                        user.setEmail(sc.nextLine());
                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 7:
                        System.out.print("New password : ");
                        user.setPassword(sc.nextLine());
                        System.out.println(color.green+"Updated !"+color.white);
                        break;
                    case 0:
                        break;
                }
            } else System.out.println(color.red+"User doesnt exist !"+color.white);
        }
    }

    public void delete(){

        if (users.isEmpty()){
            System.out.println(color.red+"there are no users !"+color.white);
            return;
        }
        boolean exit = true;
        while (exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Delete all users");
            System.out.println("2 - Delete a specific user");
            System.out.println(color.green + "0 - Return");
            System.out.print(color.blue + "=> " + color.white);
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    users.clear();
                    System.out.println(color.green + "All users are deleted !" + color.white);
                    exit = false;
                    break;
                case 2:
                    System.out.print(color.cyan+"Enter the user ID you want to delete : "+color.white);
                    String id = sc.nextLine();
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).ID.equals(id)) {
                            users.remove(i);
                            System.out.println(color.green + "User deleted successfully" + color.white);
                        }
                        exit = false;
                    }
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println(color.red+"Invalid choice try again !"+color.white);
            }
        }
    }
}

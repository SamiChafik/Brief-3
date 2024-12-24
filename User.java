
public class User extends Person {

    enum Role {
        ADMIN,
        EMPLOYEE,
        CLIENT
    }

    public User(String ID, String p_name, String f_name, int age, String tel, String email, String password) {
        super(ID, p_name, f_name, age, tel, email, password);
    }

    @Override
    public String toString() {
        return
                "User ID : " + ID + '\n' +
                "Personal Name : " + P_Name + '\n' +
                "Family Name : " + F_Name + '\n' +
                "Age : " + Age + '\n' +
                "User phone : " + tel + '\n' +
                "Email : " + email + '\n' +
                "password : " + password + '\n';
    }
}

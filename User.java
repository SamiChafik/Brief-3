
public class User extends Person {

    enum Role {
        ADMIN,
        EMPLOYEE,
        CLIENT
    }

    public User(String ID, String name, int age, String tel, String email, String password) {
        super(ID, name, age, tel, email, password);
    }

    @Override
    public String toString() {
        return
                "User ID : " + ID + '\n' +
                "Name : " + Name + '\n' +
                "Age : " + Age + '\n' +
                "User phone : " + tel + '\n' +
                "Email : " + email + '\n' +
                "password : " + password + '\n';
    }
}

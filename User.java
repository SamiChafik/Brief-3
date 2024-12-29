
public class User extends Person {
    String email,password;
    Role role;
    public User(String ID, String p_name, String f_name, int age, String tel, String email, String password, Role role) {
        super(ID, p_name, f_name, age, tel);
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
                "password : " + password + '\n' +
                "Role : " + role.getRole()
                ;
    }
}

public class Person {
    String ID,P_Name,F_Name,tel;
    int Age;

    public Person(String ID,String p_name,String f_name, int age, String tel) {
        this.ID = ID;
        this.P_Name = p_name;
        this.F_Name = f_name;
        this.Age = age;
        this.tel = tel;
    }

    public String getP_Name() {
        return P_Name;
    }
    public void setP_Name(String p_Name) {
        P_Name = p_Name;
    }

    public String getF_Name() {
        return F_Name;
    }

    public void setF_Name(String f_Name) {
        F_Name = f_Name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}

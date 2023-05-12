package ro.mycode.models;

public class User {
    private int id;
    private String email;
    private String password;
    private String fullName;
    private int phone;
    private String type;

    public User(int id, String password, String email, String fullName, int phone, String type) {
        this.id = id;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    @Override
    public String toString() {
        String text = "";
        text += "id " + id;
        text += "password " + password;
        text += "fullName " + fullName;
        text += "phone " + phone;
        text += "email " + email;
        text += "type " + type;
        return text;
    }

    @Override
    public boolean equals(Object object) {
        User c = (User) object;
        return this.id == c.id && this.email.equals(c.email) && this.password.equals(c.password) &&
                this.fullName.equals(c.fullName) && this.phone == c.phone && this.type.equals(type);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;

    }

}

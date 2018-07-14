package hib.dto;

public class User 
{
    
    private String username;
    private String department;
    private String email;
    private long contactno;
    private String city;
    private String gender;
    private String password;

    public User() {
    }

    public User(String username, String department, String email, long contactno, String city, String gender, String password) {
        this.username = username;
        this.department = department;
        this.email = email;
        this.contactno = contactno;
        this.city = city;
        this.gender = gender;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactno() {
        return contactno;
    }

    public void setContactno(long contactno) {
        this.contactno = contactno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

}
    
package hib.dto;

public class Useracc 
{
    
    private String username;
    private String email;
    private long contactno;
    private String city;
    private String gender;
    private int workexperience;
    private String password;

    public Useracc() {
    }

    public Useracc(String username, String email, long contactno, String city, String gender, int workexperience, String password) {
        this.username = username;
        this.email = email;
        this.contactno = contactno;
        this.city = city;
        this.gender = gender;
        this.workexperience = workexperience;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(int workexperience) {
        this.workexperience = workexperience;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
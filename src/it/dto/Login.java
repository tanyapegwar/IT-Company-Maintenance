
package it.dto;

public class Login {

    private String managerUsername;
    private String managerPassword;
    private String operatorUsername;
    private String operatorPassword;
    private String accountantUsername;
    private String accountantPassword;

    public Login() {
    }

    public Login(String managerUsername, String managerPassword, String operatorUsername, String operatorPassword, String accountantUsername, String accountantPassword) {
        this.managerUsername = managerUsername;
        this.managerPassword = managerPassword;
        this.operatorUsername = operatorUsername;
        this.operatorPassword = operatorPassword;
        this.accountantUsername = accountantUsername;
        this.accountantPassword = accountantPassword;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getOperatorUsername() {
        return operatorUsername;
    }

    public void setOperatorUsername(String operatorUsername) {
        this.operatorUsername = operatorUsername;
    }

    public String getOperatorPassword() {
        return operatorPassword;
    }

    public void setOperatorPassword(String operatorPassword) {
        this.operatorPassword = operatorPassword;
    }

    public String getAccountantUsername() {
        return accountantUsername;
    }

    public void setAccountantUsername(String accountantUsername) {
        this.accountantUsername = accountantUsername;
    }

    public String getAccountantPassword() {
        return accountantPassword;
    }

    public void setAccountantPassword(String accountantPassword) {
        this.accountantPassword = accountantPassword;
    }
    
}

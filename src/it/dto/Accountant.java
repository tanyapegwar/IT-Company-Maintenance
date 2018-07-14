
package it.dto;

public class Accountant {
      private int accountantContactNo;
      private String accountantInchargeName;
      private String accountantEmail;
      private String month;
      private int monthlyProfit;
      private int monthlyMaintenanceCost;
     private String statement;

    public Accountant() {
    }

    public Accountant(int accountantContactNo, String accountantInchargeName, String accountantEmail, String month, int monthlyProfit, int monthlyMaintenanceCost, String statement) {
        this.accountantContactNo = accountantContactNo;
        this.accountantInchargeName = accountantInchargeName;
        this.accountantEmail = accountantEmail;
        this.month = month;
        this.monthlyProfit = monthlyProfit;
        this.monthlyMaintenanceCost = monthlyMaintenanceCost;
        this.statement = statement;
    }
    
    public int getAccountantContactNo() {
        return accountantContactNo;
    }

    public void setAccountantContactNo(int accountantContactNo) {
        this.accountantContactNo = accountantContactNo;
    }

    public String getAccountantInchargeName() {
        return accountantInchargeName;
    }

    public void setAccountantInchargeName(String accountantInchargeName) {
        this.accountantInchargeName = accountantInchargeName;
    }

    public String getAccountantEmail() {
        return accountantEmail;
    }

    public void setAccountantEmail(String accountantEmail) {
        this.accountantEmail = accountantEmail;
    }

    public int getMonthlyProfit() {
        return monthlyProfit;
    }

    public void setMonthlyProfit(int monthlyProfit) {
        this.monthlyProfit = monthlyProfit;
    }

    public int getMonthlyMaintenanceCost() {
        return monthlyMaintenanceCost;
    }

    public void setMonthlyMaintenanceCost(int monthlyMaintenanceCost) {
        this.monthlyMaintenanceCost = monthlyMaintenanceCost;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

   
    
  
}

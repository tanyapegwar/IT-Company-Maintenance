
package it.dto;


public class Managers {
    
   private String managerName;
        private long managerContactNo;
        private String managerEmail;
        private int noOfOperator;
        private String operatorName;
        private String operatorDepartment;
        private String operatorEmail;
        private long operatorContactNo;
        private String maintenanceApproval;
        private String accountantInchargeName;   

    public Managers() {
    }

    public Managers(String managerName, long managerContactNo, String managerEmail, int noOfOperator, String operatorName, String operatorDepartment, String operatorEmail, long operatorContactNo, String maintenanceApproval, String accountantInchargeName) {
        this.managerName = managerName;
        this.managerContactNo = managerContactNo;
        this.managerEmail = managerEmail;
        this.noOfOperator = noOfOperator;
        this.operatorName = operatorName;
        this.operatorDepartment = operatorDepartment;
        this.operatorEmail = operatorEmail;
        this.operatorContactNo = operatorContactNo;
        this.maintenanceApproval = maintenanceApproval;
        this.accountantInchargeName = accountantInchargeName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public long getManagerContactNo() {
        return managerContactNo;
    }

    public void setManagerContactNo(long managerContactNo) {
        this.managerContactNo = managerContactNo;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public int getNoOfOperator() {
        return noOfOperator;
    }

    public void setNoOfOperator(int noOfOperator) {
        this.noOfOperator = noOfOperator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorDepartment() {
        return operatorDepartment;
    }

    public void setOperatorDepartment(String operatorDepartment) {
        this.operatorDepartment = operatorDepartment;
    }

    public String getOperatorEmail() {
        return operatorEmail;
    }

    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail;
    }

    public long getOperatorContactNo() {
        return operatorContactNo;
    }

    public void setOperatorContactNo(long operatorContactNo) {
        this.operatorContactNo = operatorContactNo;
    }

    public String getMaintenanceApproval() {
        return maintenanceApproval;
    }

    public void setMaintenanceApproval(String maintenanceApproval) {
        this.maintenanceApproval = maintenanceApproval;
    }

    public String getAccountantInchargeName() {
        return accountantInchargeName;
    }

    public void setAccountantInchargeName(String accountantInchargeName) {
        this.accountantInchargeName = accountantInchargeName;
    }


}

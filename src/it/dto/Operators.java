
package it.dto;

public class Operators {
   private String operatorName;
        private String operatorDepartment;
        private String operatorEmail;
        private long operatorContactNo;
        private String month;
        private int maintenanceCost;
        private int noOfClients;
        private String technicalProblems;
        

    public Operators() {
    }

    public Operators(String operatorName, String operatorDepartment, String operatorEmail, long operatorContactNo, String month, int maintenanceCost, int noOfClients, String technicalProblems) {
        this.operatorName = operatorName;
        this.operatorDepartment = operatorDepartment;
        this.operatorEmail = operatorEmail;
        this.operatorContactNo = operatorContactNo;
        this.month = month;
        this.maintenanceCost = maintenanceCost;
        this.noOfClients = noOfClients;
        this.technicalProblems = technicalProblems;
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

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(int maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public int getNoOfClients() {
        return noOfClients;
    }

    public void setNoOfClients(int noOfClients) {
        this.noOfClients = noOfClients;
    }

    public String getTechnicalProblems() {
        return technicalProblems;
    }

    public void setTechnicalProblems(String technicalProblems) {
        this.technicalProblems = technicalProblems;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

   
}

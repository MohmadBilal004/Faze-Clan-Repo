package Model;

/**
 *
 * @author theCodeMonster
 */
public class SignUp {
    private int empID;
    private String empName;
    private String empJob;
    private String empPwd;
    private int empPhone;
    private String empMail;

  

    public SignUp(int empID, String empName, String empJob, String empPwd, int empPhone, String empMail) {
        this.empID = empID;
        this.empName = empName;
        this.empJob = empJob;
        this.empPwd = empPwd;
        this.empPhone = empPhone;
        this.empMail = empMail;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(int empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }
    
    
}

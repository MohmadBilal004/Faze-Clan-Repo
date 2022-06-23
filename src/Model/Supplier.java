package Model;


/**
 *
 * @author theCodeMonster
 */
public class Supplier {
    
    private int supID;
    private String supName;
    private int supNo;
    private String supLoc;
    private String supMail;

    public Supplier(int supID, String supName, int supNo, String supLoc, String supMail) {
        this.supID = supID;
        this.supName = supName;
        this.supNo = supNo;
        this.supLoc = supLoc;
        this.supMail = supMail;
    }

    public int getSupID() {
        return supID;
    }

    public void setSupID(int supID) {
        this.supID = supID;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public int getSupNo() {
        return supNo;
    }

    public void setSupNo(int supNo) {
        this.supNo = supNo;
    }

    public String getSupLoc() {
        return supLoc;
    }

    public void setSupLoc(String supLoc) {
        this.supLoc = supLoc;
    }

    public String getSupMail() {
        return supMail;
    }

    public void setSupMail(String supMail) {
        this.supMail = supMail;
    }

    
    
}

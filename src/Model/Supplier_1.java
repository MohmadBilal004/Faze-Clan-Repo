package Model;

public class Supplier_1 {

    private String Sname;
    private int Sno;
    private int ContactNo;
    private String Email;
    private String location;

    public Supplier_1(String Sname, int Sno, int ContactNo, String Email, String location) {
        this.Sname = Sname;
        this.Sno = Sno;
        this.ContactNo = ContactNo;
        this.Email = Email;
        this.location = location;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int Sno) {
        this.Sno = Sno;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Supplier" + "\nSupplier Name=" + Sname + "\nSupplier No.=" + Sno + "\nContact No.=" + ContactNo + "\nEmail=" + Email + "\nlocation=" + location;
    }

}

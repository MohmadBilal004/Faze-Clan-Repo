package Model;

public class WatchSalesInvoice {

    private int invoiveNo;
    private int CustomerNo;
    private String customerName;
    private String CustomerMail;
    private float unitPrice;
    private int quantity;

    public WatchSalesInvoice(int invoiveNo, String customerName, int CustomerNo,String CustomerMail, float unitPrice, int quantity) {
        this.invoiveNo = invoiveNo;       
        this.customerName = customerName;
        this.CustomerNo = CustomerNo;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.CustomerMail = CustomerMail;
    }
    

    public int getInvoiveNo() {
        return invoiveNo;
    }

    public void setInvoiveNo(int invoiveNo) {
        this.invoiveNo = invoiveNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerNo() {
        return CustomerNo;
    }

    public void setCustomerNo(int CustomerNo) {
        this.CustomerNo = CustomerNo;
    }
    
     public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String CustomerMail) {
        this.CustomerMail = CustomerMail;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "WatchSalesInvoice{" + "invoiveNo=" + invoiveNo + ", customerName=" + customerName + ", CustomerNo=" + CustomerNo + ", unitPrice=" + unitPrice + ", quantity=" + quantity + '}';
    }
    
      
    
     public float totalPrice() {
        float totalPrice = unitPrice * quantity;
        return totalPrice;
    }

}

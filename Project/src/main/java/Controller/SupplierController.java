package Controller; // Controller class is the intermediate which inserts, updates datas into database from interface

import Models.Supplier;
import DBAccessLayer.SupplierAccessLogic;


public class SupplierController {

    SupplierAccessLogic SAL;
    Supplier Supplierobj;  // When user clicks on add Supplier this object  must be created 

    
     public SupplierController(){
         SAL = new SupplierAccessLogic();
    }
    public Supplier addSuplier(String Sname, int Sno, int ContactNo, String Email, String location)// When user clicks on add Supplier this addSupplier method will be called 
    {
        Supplierobj = new Supplier(Sname, Sno, ContactNo, Email, location);
        return Supplierobj;
    }
    public boolean insertSupplierToDB(Supplier supplier){
         boolean result =   SAL.addSupplierToDB(supplier);
         return result;
}
}

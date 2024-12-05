package dev.niss.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Supplier extends FXModel {

    private final FXIntegerProperty supplierID;
    private final FXStringProperty supplierName;
    private final FXStringProperty address;

    public Supplier(Integer supplierID,
            String suppleirName,
            String address) {
        this.supplierID = new FXIntegerProperty(supplierID);
        this.supplierName = new FXStringProperty(suppleirName);
        this.address = new FXStringProperty(address);

        track_properties(this.supplierID,
                this.supplierName,
                this.address);
    }
    // Supplier ID
    public FXIntegerProperty supplierIDProperty() {
        return supplierID;
    }

    public Integer getSuppleirID() {
        return supplierIDProperty().get();
    }

    public void setSuppleirID(Integer supplierID) {
        supplierIDProperty().set(supplierID);
    }
    // Suppleir Name
    public FXStringProperty supplierNameProperty() {
        return supplierName;
    }

    public String getSuppleirName() {
        return supplierNameProperty().get();
    }

    public void setSuppleirName(String supplierName) {
        supplierNameProperty().set(supplierName);
    }
    // Address
    public FXStringProperty addressProperty() {
        return address;
    }

    public String getAdress() {
        return addressProperty().get();
    }

    public void setAddress(String address) {
        addressProperty().set(address);
    }

    @Override
    public FXModel clone() {
        return new Supplier(getSuppleirID(),
                getSuppleirName(),
                getAdress());
        
    }

    @Override
    public void copy(FXModel arg0) {
        Supplier c = (Supplier) arg0;
    }

}

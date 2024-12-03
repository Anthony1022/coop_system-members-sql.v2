package dev.niss.models.delivery;

import java.time.LocalDate;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class DeliveryReceipt extends FXModel {

    private final FXIntegerProperty dr_id;
    private final FXStringProperty dr_num;
    private final FXIntegerProperty supplier_id;
    private final FXObjectProperty<LocalDate> datedel;
    private final FXDoubleProperty totalamt;
    private final FXDoubleProperty paidamt;
    private final FXIntegerProperty user_id;

    public DeliveryReceipt(Integer dr_id,
            String dr_num,
            Integer supplier_id,
            LocalDate datedel,
            Double totalamt,
            Double paidamt,
            Integer user_id) {
        this.dr_id = new FXIntegerProperty(dr_id);
        this.dr_num = new FXStringProperty(dr_num);
        this.supplier_id = new FXIntegerProperty(supplier_id);
        this.datedel = new FXObjectProperty<>(datedel);
        this.totalamt = new FXDoubleProperty(totalamt);
        this.paidamt = new FXDoubleProperty(paidamt);
        this.user_id = new FXIntegerProperty(user_id);

        track_properties(this.dr_id,
                this.dr_num,
                this.supplier_id,
                this.datedel,
                this.totalamt,
                this.paidamt,
                this.user_id);
    }

    // DRID
    public FXIntegerProperty dridProperty() {
        return dr_id;
    }

    public Integer getDRID() {
        return dridProperty().get();
    }

    public void setDRID(Integer dr_id) {
        dridProperty().setValue(dr_id);
    }

    // DR_Num
    public FXStringProperty drnumProperty() {
        return dr_num;
    }

    public String getDRNum() {
        return drnumProperty().get();
    }

    public void setDRNum(String dr_num) {
        drnumProperty().set(dr_num);
    }

    // Suppplier_Id
    public FXIntegerProperty supplieridProperty() {
        return supplier_id;
    }

    public Integer getSupplierId() {
        return supplieridProperty().get();
    }

    public void setSupplierid(Integer supplier_id) {
        supplieridProperty().set(supplier_id);
    }

    // DateDel
    public FXObjectProperty<LocalDate> datedelProperty() {
        return datedel;
    }

    public LocalDate getDateDel() {
        return datedelProperty().get();
    }

    public void setDateDel(LocalDate daredel) {
        datedelProperty().set(daredel);
    }

    // Total Amount
    public FXDoubleProperty totalamtProperty() {
        return totalamt;
    }

    public Double getTotalAmt() {
        return totalamtProperty().get();
    }

    public void setTotalAmt(Double totalamt) {
        totalamtProperty().set(totalamt);
    }

    // Paid Amount
    public FXDoubleProperty paidamtProperty() {
        return paidamt;
    }

    public Double getPaidAmt() {
        return paidamtProperty().get();
    }

    public void setPaidamt(Double paidamt) {
        paidamtProperty().set(paidamt);
    }
    // User ID
    public FXIntegerProperty useridProperty() {
        return user_id;
    }

    public Integer getUserID() {
        return useridProperty().get();
    }

    public void setUserID(Integer user_id) {
        useridProperty().set(user_id);
    }

    @Override
    public FXModel clone() {
        return new DeliveryReceipt(getUserID(),
                getDRNum(),
                getSupplierId(),
                getDateDel(),
                getTotalAmt(),
                getPaidAmt(),
                getDRID());

    }

    @Override
    public void copy(FXModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

}

package dev.niss.models.sales;

import java.time.LocalDate;


import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class InVoice extends FXModel {

    private final FXIntegerProperty salesID;
    private final FXStringProperty invoNum;
    private final FXDoubleProperty totalamt;
    private final FXIntegerProperty memberID;
    private final FXIntegerProperty userID;
    private final FXObjectProperty<LocalDate> date;

    public InVoice(Integer salesID, 
    String invoNum, 
    Double totalamt, 
    Integer memberID, 
    Integer userID, 
    LocalDate date){
        this.salesID = new FXIntegerProperty(salesID);
        this.invoNum = new FXStringProperty(invoNum);
        this.totalamt = new FXDoubleProperty(totalamt);
        this.memberID = new FXIntegerProperty(memberID);
        this.userID = new FXIntegerProperty(userID);
        this.date = new FXObjectProperty<>(date);

        track_properties(this.salesID,
        this.invoNum,
        this.totalamt,
        this.memberID,
        this.memberID,
        this.userID,
        this.date);
    }
    // Sales ID 
    public FXIntegerProperty salesIDProperty(){
        return salesID;
    }
    public Integer getSalesID(){
        return salesIDProperty().get();
    }
    public void setSalesID(Integer salesID) {
        salesIDProperty().set(salesID);
    }
    // Invoice Num
    public FXStringProperty invoNumProperty(){
        return invoNum;
    }
    public String getInvoNum(){
        return invoNumProperty().get();
    }
    public void setInvoNum(String invoNum){
        invoNumProperty().set(invoNum);
    }
    // Total Amount
    public FXDoubleProperty totalamtProperty(){
        return totalamt;
    }
    public Double getTotalAmt(){
        return totalamtProperty().get();
    }
    public void setTotalAmt(Double totalamt){
        totalamtProperty().set(totalamt);
    }
    // Member ID
    public FXIntegerProperty memberIDProperty(){
        return memberID;
    }
    public Integer getMemberID(){
        return memberIDProperty().get();
    }
    public void setMemberID(Integer memberID){
        memberIDProperty().set(memberID);
    }
    // User Id 
    public FXIntegerProperty userIDProperty(){
        return userID;
    }
    public Integer getUserID(){
        return userIDProperty().get();
    }
    public void setUserID(Integer userID){
        userIDProperty().set(userID);
    }
    // Date
    public FXObjectProperty<LocalDate> dateProperty(){
        return date;
    }
    public LocalDate getDate(){
        return dateProperty().get();
    }
    public void setDate(LocalDate date){
        dateProperty().set(date);
    }

    @Override
    public FXModel clone() {
       return new InVoice(getSalesID(), 
       getInvoNum(), 
       getTotalAmt(), 
       getMemberID(), 
       getUserID(), 
       getDate());
    }

    @Override
    public void copy(FXModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }
    
}

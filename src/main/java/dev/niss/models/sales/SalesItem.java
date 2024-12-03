package dev.niss.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;

public class SalesItem extends FXModel {

    private final FXIntegerProperty salesID;
    private final FXIntegerProperty stockID;
    private final FXDoubleProperty quantity;
    private final FXDoubleProperty amount;
    
    public SalesItem(Integer salesID, Integer stockId, Double quantity, Double amount) {
        this.salesID = new FXIntegerProperty(salesID);
        this.stockID = new FXIntegerProperty(stockId);
        this.quantity = new FXDoubleProperty(quantity);
        this.amount = new FXDoubleProperty(amount);
        
        track_properties(this.salesID,
        this.stockID,
        this.quantity,
        this.amount);
    }
    // Sales ID
    public FXIntegerProperty salesIDProperty(){
        return salesID;
    }
    public Integer getSalesID(){
        return salesIDProperty().get();
    }
    public void setSalesID(Integer salesID){
        salesIDProperty().set(salesID);
    }
    // Stock ID 
    public FXIntegerProperty stockIDProperty(){
        return stockID;
    }
    public Integer getStockID(){
        return stockIDProperty().get();
    }
    public void setStockID(Integer stockID){
        stockIDProperty().set(stockID);
    }
    // Quantity
    public FXDoubleProperty quantityProperty(){
        return quantity;
    }
    public Double getQuantity(){
        return quantityProperty().get();
    }
    public void setQuantity(Double quantity){
        quantityProperty().set(quantity);
    }
    // Amount 
    public FXDoubleProperty amountProperty(){
        return amount;
    } 
    public Double getAmount(){
       return amountProperty().get();
    }
    public void setAmount(Double amount){
        amountProperty().set(amount);
    }

    @Override
    public FXModel clone() {
        return new SalesItem(getSalesID(), getStockID(), getQuantity(), getAmount());
    }

    @Override
    public void copy(FXModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }
    
}

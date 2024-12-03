package dev.niss.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Stock extends FXModel {

    private final FXIntegerProperty stock_ID;
    private final FXStringProperty description;
    private final FXDoubleProperty unitprice;
    private final FXDoubleProperty sellingprice;
    private final FXDoubleProperty quantity;
    private final FXStringProperty unit;
    private final FXIntegerProperty criticalLevel;

    public Stock(Integer stock_ID,
            String description,
            Double unitprice,
            Double sellingprice,
            Double quantity,
            String unit,
            Integer criticalLevel) {
        this.stock_ID = new FXIntegerProperty(stock_ID);
        this.description = new FXStringProperty(description);
        this.unitprice = new FXDoubleProperty(unitprice);
        this.sellingprice = new FXDoubleProperty(sellingprice);
        this.quantity = new FXDoubleProperty(quantity);
        this.unit = new FXStringProperty(unit);
        this.criticalLevel = new FXIntegerProperty(criticalLevel);

        track_properties(this.stock_ID,
                this.description,
                this.unitprice,
                this.sellingprice,
                this.quantity,
                this.unit,
                this.criticalLevel);

    }
    // Stock ID
    public FXIntegerProperty stockIDProperty() {
        return stock_ID;
    }

    public Integer getStockID() {
        return stockIDProperty().get();
    }

    public void setStockID(Integer stock_Id) {
        stockIDProperty().set(stock_Id);
    }
    // Descriptioen
    public FXStringProperty descriptionProperty() {
        return description;
    }

    public String getDesription() {
        return descriptionProperty().get();
    }

    public void setDescription(String decription) {
        descriptionProperty().set(decription);
    }
    // Unit Price 
    public FXDoubleProperty unitpriceProperty(){
        return unitprice;
    }
    public Double getUnitPrice(){
        return unitpriceProperty().get();
    }
    public void setUnitPrice(Double unitprice) {
        unitpriceProperty().set(unitprice);
    }
    // Selling Price
    public FXDoubleProperty sellingpriceProperty(){
        return sellingprice;
    }
    public Double getSellingPrice(){
        return sellingpriceProperty().get();
    }
    public void setSellingPrice(Double sellingprice) {
        sellingpriceProperty().set(sellingprice);
    }
    // Quantity
    public FXDoubleProperty quantityProperty(){
        return quantity;
    }
    public Double getQuanntity(){
        return quantityProperty().get();
    }
    public void setQuantity(Double quantity){
        quantityProperty().set(quantity);
    }
    // Unit
    public FXStringProperty unitProperty(){
        return unit;
    }
    public String getUnit(){
        return unitProperty().get();
    }
    public void setUnit(String unit){
        unitProperty().set(unit);
    }
    // Critical Level 
    public FXIntegerProperty criticallevelProperty() {
        return criticalLevel;
    }
    public Integer getCriticalLevel(){
        return criticallevelProperty().get();
    }
    public void setCriticalLevel(Integer criticalLevel){
        criticallevelProperty().set(criticalLevel);
    }
    @Override public FXModel clone() {
        return new Stock(getStockID(), 
        getDesription(),
         getUnitPrice(), 
         getSellingPrice(), 
         getQuanntity(), 
         getUnit(), 
         getCriticalLevel());
         
    }

    @Override
    public void copy(FXModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

}

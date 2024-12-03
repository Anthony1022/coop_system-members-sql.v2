package dev.niss.models.delivery;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;

public class DeliveryItems extends FXModel {

	private final FXIntegerProperty dr_id;
	private final FXIntegerProperty stock_id;
	private final FXDoubleProperty buying_price;
	private final FXDoubleProperty qty;
	private final FXDoubleProperty amount;

	public DeliveryItems(Integer dr_id,
			Integer stock_id,
			Double buying_price,
			Double qty,
			Double amount) {
		this.dr_id = new FXIntegerProperty(dr_id);
		this.stock_id = new FXIntegerProperty(stock_id);
		this.buying_price = new FXDoubleProperty(buying_price);
		this.qty = new FXDoubleProperty(qty);
		this.amount = new FXDoubleProperty(amount);

		track_properties(this.dr_id,
				this.stock_id,
				this.buying_price,
				this.qty,
				this.amount);
	}

	// DRID
	public FXIntegerProperty dridProperty() {
		return dr_id;
	}

	public Integer getDRID() {
		return dridProperty().get();
	}

	public void setDRID(Integer dr_id) {
		dridProperty().set(dr_id);
	}

	// stock id
	public FXIntegerProperty stockProperty() {
		return stock_id;
	}

	public Integer getStockID() {
		return stockProperty().get();
	}

	public void setStockID(Integer stock_id) {
		stockProperty().setValue(stock_id);
	}

	// Buying price
	public FXDoubleProperty buyingpriceProperty() {
		return buying_price;
	}

	public Double getBuyingP() {
		return buyingpriceProperty().get();
	}

	public void setBuyingP(Double buying_price) {
		buyingpriceProperty().setValue(buying_price);
	}

	// QTY
	public FXDoubleProperty qtyProperty() {
		return qty;
	}

	public Double getQTY() {
		return qtyProperty().get();
	}

	public void setQTY(Double qty) {
		qtyProperty().setValue(qty);
	}

	// Amount
	public FXDoubleProperty amountProperty() {
		return amount;
	}

	public Double getAmount() {
		return amountProperty().get();
	}

	public void setAmount(Double amount) {
		amountProperty().setValue(amount);
	}

	@Override
	public FXModel clone() {
		return new DeliveryItems(getDRID(), getStockID(), getBuyingP(), getQTY(), getAmount());
		
	}

	@Override
	public void copy(FXModel arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'copy'");
	}

}

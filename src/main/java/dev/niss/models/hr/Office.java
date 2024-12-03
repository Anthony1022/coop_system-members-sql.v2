package dev.niss.models.hr;

import java.util.UUID;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXStringProperty;

public class Office extends FXModel {
	private final FXStringProperty name;

	public Office(UUID id, String name) {
		super(id);
		this.name = new FXStringProperty(name);

		track_properties(this.name);
	}
	// Name
	public FXStringProperty nameProperty() {
		return name;
	}

	public String getName() {
		return nameProperty().get();
	}

	public void setName(String name) {
		nameProperty().set(name);
	}

	@Override
	public FXModel clone() {
		return new Office(getId(), getName());
		
	}

	@Override
	public void copy(FXModel arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'copy'");
	}

}

package model;

public class MasterFiles {
	Supplier SupplierObject;
	TaxTable TaxTableObject;

	// Getter Methods

	public Supplier getSupplier() {
		return SupplierObject;
	}

	public TaxTable getTaxTable() {
		return TaxTableObject;
	}

	// Setter Methods

	public void setSupplier(Supplier SupplierObject) {
		this.SupplierObject = SupplierObject;
	}

	public void setTaxTable(TaxTable TaxTableObject) {
		this.TaxTableObject = TaxTableObject;
	}
}
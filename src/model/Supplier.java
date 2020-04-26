package model;

public class Supplier {
	private String SupplierID;
	private String AccountID;
	private String SupplierTaxID;
	private String CompanyName;
	BillingAddress BillingAddressObject;
	ShipFromAddress ShipFromAddressObject;
	private String SelfBillingIndicator;

	// Getter Methods

	public String getSupplierID() {
		return SupplierID;
	}

	public String getAccountID() {
		return AccountID;
	}

	public String getSupplierTaxID() {
		return SupplierTaxID;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public BillingAddress getBillingAddress() {
		return BillingAddressObject;
	}

	public ShipFromAddress getShipFromAddress() {
		return ShipFromAddressObject;
	}

	public String getSelfBillingIndicator() {
		return SelfBillingIndicator;
	}

	// Setter Methods

	public void setSupplierID(String SupplierID) {
		this.SupplierID = SupplierID;
	}

	public void setAccountID(String AccountID) {
		this.AccountID = AccountID;
	}

	public void setSupplierTaxID(String SupplierTaxID) {
		this.SupplierTaxID = SupplierTaxID;
	}

	public void setCompanyName(String CompanyName) {
		this.CompanyName = CompanyName;
	}

	public void setBillingAddress(BillingAddress BillingAddressObject) {
		this.BillingAddressObject = BillingAddressObject;
	}

	public void setShipFromAddress(ShipFromAddress ShipFromAddressObject) {
		this.ShipFromAddressObject = ShipFromAddressObject;
	}

	public void setSelfBillingIndicator(String SelfBillingIndicator) {
		this.SelfBillingIndicator = SelfBillingIndicator;
	}
}

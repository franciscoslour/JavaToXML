package model;

public class BillingAddress {
	private String AddressDetail;
	private String City;
	private String Country;

	// Getter Methods

	public String getAddressDetail() {
		return AddressDetail;
	}

	public String getCity() {
		return City;
	}

	public String getCountry() {
		return Country;
	}

	// Setter Methods

	public void setAddressDetail(String AddressDetail) {
		this.AddressDetail = AddressDetail;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
}
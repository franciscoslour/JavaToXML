package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyAddress", propOrder = {"AddressDetail","City","PostalCode","Country"})
public class CompanyAddress {
	private String AddressDetail;
	private String City;
	private String PostalCode;
	private String Country;

	// Getter Methods

	public String getAddressDetail() {
		return AddressDetail;
	}

	public String getCity() {
		return City;
	}

	public String getPostalCode() {
		return PostalCode;
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

	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
}
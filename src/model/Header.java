package model;

public class Header {
	private String AuditFileVersion;
	private String CompanyID;
	private String TaxRegistrationNumber;
	private String TaxAccountingBasis;
	private String CompanyName;
	private String BusinessName;
	CompanyAddress CompanyAddressObject;
	private String FiscalYear;
	private String StartDate;
	private String EndDate;
	private String CurrencyCode;
	private String DateCreated;
	private String TaxEntity;
	private String ProductCompanyTaxID;
	private String SoftwareValidationNumber;
	private String ProductID;
	private String ProductVersion;

	// Getter Methods

	public String getAuditFileVersion() {
		return AuditFileVersion;
	}

	public String getCompanyID() {
		return CompanyID;
	}

	public String getTaxRegistrationNumber() {
		return TaxRegistrationNumber;
	}

	public String getTaxAccountingBasis() {
		return TaxAccountingBasis;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public String getBusinessName() {
		return BusinessName;
	}

	public CompanyAddress getCompanyAddress() {
		return CompanyAddressObject;
	}

	public String getFiscalYear() {
		return FiscalYear;
	}

	public String getStartDate() {
		return StartDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public String getDateCreated() {
		return DateCreated;
	}

	public String getTaxEntity() {
		return TaxEntity;
	}

	public String getProductCompanyTaxID() {
		return ProductCompanyTaxID;
	}

	public String getSoftwareValidationNumber() {
		return SoftwareValidationNumber;
	}

	public String getProductID() {
		return ProductID;
	}

	public String getProductVersion() {
		return ProductVersion;
	}

	// Setter Methods

	public void setAuditFileVersion(String AuditFileVersion) {
		this.AuditFileVersion = AuditFileVersion;
	}

	public void setCompanyID(String CompanyID) {
		this.CompanyID = CompanyID;
	}

	public void setTaxRegistrationNumber(String TaxRegistrationNumber) {
		this.TaxRegistrationNumber = TaxRegistrationNumber;
	}

	public void setTaxAccountingBasis(String TaxAccountingBasis) {
		this.TaxAccountingBasis = TaxAccountingBasis;
	}

	public void setCompanyName(String CompanyName) {
		this.CompanyName = CompanyName;
	}

	public void setBusinessName(String BusinessName) {
		this.BusinessName = BusinessName;
	}

	public void setCompanyAddress(CompanyAddress CompanyAddressObject) {
		this.CompanyAddressObject = CompanyAddressObject;
	}

	public void setFiscalYear(String FiscalYear) {
		this.FiscalYear = FiscalYear;
	}

	public void setStartDate(String StartDate) {
		this.StartDate = StartDate;
	}

	public void setEndDate(String EndDate) {
		this.EndDate = EndDate;
	}

	public void setCurrencyCode(String CurrencyCode) {
		this.CurrencyCode = CurrencyCode;
	}

	public void setDateCreated(String DateCreated) {
		this.DateCreated = DateCreated;
	}

	public void setTaxEntity(String TaxEntity) {
		this.TaxEntity = TaxEntity;
	}

	public void setProductCompanyTaxID(String ProductCompanyTaxID) {
		this.ProductCompanyTaxID = ProductCompanyTaxID;
	}

	public void setSoftwareValidationNumber(String SoftwareValidationNumber) {
		this.SoftwareValidationNumber = SoftwareValidationNumber;
	}

	public void setProductID(String ProductID) {
		this.ProductID = ProductID;
	}

	public void setProductVersion(String ProductVersion) {
		this.ProductVersion = ProductVersion;
	}
}

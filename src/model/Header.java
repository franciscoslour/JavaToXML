package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"AuditFileVersion", "CompanyID", "TaxRegistrationNumber", "TaxAccountingBasis", "CompanyName", "BusinessName",
    "CompanyAddress", "FiscalYear", "StartDate", "EndDate", "CurrencyCode", "DateCreated", "TaxEntity", "ProductCompanyTaxID",
    "SoftwareValidationNumber", "ProductID", "ProductVersion"})
public class Header {

    private String AuditFileVersion;
    private String CompanyID;
    private String TaxRegistrationNumber;
    private String TaxAccountingBasis;
    private String CompanyName;
    private String BusinessName;
    private CompanyAddress CompanyAddress;
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

    public String getAuditFileVersion() {
        return AuditFileVersion;
    }

    public void setAuditFileVersion(String AuditFileVersion) {
        this.AuditFileVersion = AuditFileVersion;
    }

    public String getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(String CompanyID) {
        this.CompanyID = CompanyID;
    }

    public String getTaxRegistrationNumber() {
        return TaxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String TaxRegistrationNumber) {
        this.TaxRegistrationNumber = TaxRegistrationNumber;
    }

    public String getTaxAccountingBasis() {
        return TaxAccountingBasis;
    }

    public void setTaxAccountingBasis(String TaxAccountingBasis) {
        this.TaxAccountingBasis = TaxAccountingBasis;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    public CompanyAddress getCompanyAddress() {
        return CompanyAddress;
    }

    public void setCompanyAddress(CompanyAddress CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    public String getFiscalYear() {
        return FiscalYear;
    }

    public void setFiscalYear(String FiscalYear) {
        this.FiscalYear = FiscalYear;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    public String getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(String DateCreated) {
        this.DateCreated = DateCreated;
    }

    public String getTaxEntity() {
        return TaxEntity;
    }

    public void setTaxEntity(String TaxEntity) {
        this.TaxEntity = TaxEntity;
    }

    public String getProductCompanyTaxID() {
        return ProductCompanyTaxID;
    }

    public void setProductCompanyTaxID(String ProductCompanyTaxID) {
        this.ProductCompanyTaxID = ProductCompanyTaxID;
    }

    public String getSoftwareValidationNumber() {
        return SoftwareValidationNumber;
    }

    public void setSoftwareValidationNumber(String SoftwareValidationNumber) {
        this.SoftwareValidationNumber = SoftwareValidationNumber;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductVersion() {
        return ProductVersion;
    }

    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

}

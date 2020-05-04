package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"SupplierID","AccountID","SupplierTaxID","CompanyName","BillingAddress","ShipFromAddress","SelfBillingIndicator"})
public class Supplier {

    private String SupplierID;
    private String AccountID;
    private String SupplierTaxID;
    private String CompanyName;
    private BillingAddress BillingAddress;
    private ShipFromAddress ShipFromAddress;
    private String SelfBillingIndicator;

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    public String getSupplierTaxID() {
        return SupplierTaxID;
    }

    public void setSupplierTaxID(String SupplierTaxID) {
        this.SupplierTaxID = SupplierTaxID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public BillingAddress getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(BillingAddress BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    public ShipFromAddress getShipFromAddress() {
        return ShipFromAddress;
    }

    public void setShipFromAddress(ShipFromAddress ShipFromAddress) {
        this.ShipFromAddress = ShipFromAddress;
    }

    public String getSelfBillingIndicator() {
        return SelfBillingIndicator;
    }

    public void setSelfBillingIndicator(String SelfBillingIndicator) {
        this.SelfBillingIndicator = SelfBillingIndicator;
    }

}

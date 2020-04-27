/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Francisco Lourenço
 */
public class Invoice {
    
    private String invoiceNo;
    private String hash;
    private String sourceID;
    private String period;
    private String invoiceDate;
    private String purchaseType;
    private String supplierID;
    private DocumentTotals documentTotals;
    private WithholdingTax withholdingTax;

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public DocumentTotals getDocumentTotals() {
        return documentTotals;
    }

    public void setDocumentTotals(DocumentTotals documentTotals) {
        this.documentTotals = documentTotals;
    }

    public WithholdingTax getWithholdingTax() {
        return withholdingTax;
    }

    public void setWithholdingTax(WithholdingTax withholdingTax) {
        this.withholdingTax = withholdingTax;
    }
    
    
    
}

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
public class TaxTableEntry {

    private String taxType;
    private String taxCountryRegion;
    private String taxCode;
    private String description;
    private String taxPercentage;

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getTaxCountryRegion() {
        return taxCountryRegion;
    }

    public void setTaxCountryRegion(String taxCountryRegion) {
        this.taxCountryRegion = taxCountryRegion;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

}

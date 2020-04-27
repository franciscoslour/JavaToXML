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
public class Deductible {

    private String taxBase;
    private String deductibleAmount;
    private String deductiblePercentage;
    private String deductibleTaxType;

    public String getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    public String getDeductibleAmount() {
        return deductibleAmount;
    }

    public void setDeductibleAmount(String deductibleAmount) {
        this.deductibleAmount = deductibleAmount;
    }

    public String getDeductiblePercentage() {
        return deductiblePercentage;
    }

    public void setDeductiblePercentage(String deductiblePercentage) {
        this.deductiblePercentage = deductiblePercentage;
    }

    public String getDeductibleTaxType() {
        return deductibleTaxType;
    }

    public void setDeductibleTaxType(String deductibleTaxType) {
        this.deductibleTaxType = deductibleTaxType;
    }

}

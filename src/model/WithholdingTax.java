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
public class WithholdingTax {
    
    private String withholdingTaxType;
    private String withholdingTaxDescription;
    private String withholdingTaxAmount;

    public String getWithholdingTaxType() {
        return withholdingTaxType;
    }

    public void setWithholdingTaxType(String withholdingTaxType) {
        this.withholdingTaxType = withholdingTaxType;
    }

    public String getWithholdingTaxDescription() {
        return withholdingTaxDescription;
    }

    public void setWithholdingTaxDescription(String withholdingTaxDescription) {
        this.withholdingTaxDescription = withholdingTaxDescription;
    }

    public String getWithholdingTaxAmount() {
        return withholdingTaxAmount;
    }

    public void setWithholdingTaxAmount(String withholdingTaxAmount) {
        this.withholdingTaxAmount = withholdingTaxAmount;
    }
    
    
}

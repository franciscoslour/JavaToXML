/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Lourenço
 */
public class DocumentTotals {
    
    private String taxPayable;
    private String netTotal;
    private String grossTotal;
    private List<Deductible> Deductibles = new ArrayList<>();
    private Currency currency;

    public String getTaxPayable() {
        return taxPayable;
    }

    public void setTaxPayable(String taxPayable) {
        this.taxPayable = taxPayable;
    }

    public String getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(String netTotal) {
        this.netTotal = netTotal;
    }

    public String getGrossTotal() {
        return grossTotal;
    }

    public void setGrossTotal(String grossTotal) {
        this.grossTotal = grossTotal;
    }

    public List<Deductible> getDeductibles() {
        return Deductibles;
    }

    public void setDeductibles(List<Deductible> Deductibles) {
        this.Deductibles = Deductibles;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    
}

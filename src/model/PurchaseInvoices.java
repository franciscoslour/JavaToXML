package model;

import java.util.ArrayList;
import java.util.List;

public class PurchaseInvoices {

    private String NumberOfEntries;
    List<Invoice> Invoices = new ArrayList<Invoice>();

    public String getNumberOfEntries() {
        return NumberOfEntries;
    }

    public void setNumberOfEntries(String numberOfEntries) {
        NumberOfEntries = numberOfEntries;
    }

    public List<Invoice> getInvoices() {
        return Invoices;
    }

    public void setInvoices(List<Invoice> Invoices) {
        this.Invoices = Invoices;
    }

}

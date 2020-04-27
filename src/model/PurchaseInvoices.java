package model;

import java.util.ArrayList;

public class PurchaseInvoices {

    private String NumberOfEntries;
    ArrayList<Invoice> Invoices = new ArrayList<Invoice>();

    public String getNumberOfEntries() {
        return NumberOfEntries;
    }

    public void setNumberOfEntries(String numberOfEntries) {
        NumberOfEntries = numberOfEntries;
    }

    public ArrayList<Invoice> getInvoices() {
        return Invoices;
    }

    public void setInvoices(ArrayList<Invoice> Invoices) {
        this.Invoices = Invoices;
    }

}

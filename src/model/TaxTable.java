package model;

import java.util.ArrayList;

public class TaxTable {

    ArrayList<TaxTableEntry> TaxTableEntries = new ArrayList<TaxTableEntry>();

    public ArrayList<TaxTableEntry> getTaxTableEntries() {
        return TaxTableEntries;
    }

    public void setTaxTableEntries(ArrayList<TaxTableEntry> TaxTableEntries) {
        this.TaxTableEntries = TaxTableEntries;
    }

}

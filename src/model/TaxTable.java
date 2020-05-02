package model;

import java.util.ArrayList;
import java.util.List;

public class TaxTable {

    List<TaxTableEntry> TaxTableEntries = new ArrayList<>();

    public List<TaxTableEntry> getTaxTableEntries() {
        return TaxTableEntries;
    }

    public void setTaxTableEntries(List<TaxTableEntry> TaxTableEntries) {
        this.TaxTableEntries = TaxTableEntries;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.BillingAddress;
import model.MasterFiles;
import model.ShipFromAddress;
import model.Supplier;
import model.TaxTable;
import model.TaxTableEntry;

/**
 *
 * @author Pancho
 */
public class MasterFilesController {
    
    public MasterFiles generatorMasterFiles() {
        MasterFiles masterFiles = new MasterFiles();
        masterFiles.setSupplier(this.generatorSupplier());
        masterFiles.setTaxTable(this.generatorTaxTable());
        return masterFiles;
    }
    
    private Supplier generatorSupplier() {
        Supplier supplier = new Supplier();
        supplier.setSupplierID("ADM190");
        supplier.setAccountID("Desconhecido");
        supplier.setSupplierTaxID("1234567890");
        supplier.setCompanyName("FORNECEDOR EXEMPLO");
        supplier.setBillingAddress(this.generatorBillingAddress());
        supplier.setShipFromAddress(this.generatorShipFromAddress());
        supplier.setSelfBillingIndicator("0");
        return supplier;
    }
    
    private TaxTable generatorTaxTable() {
        TaxTable taxTable = new TaxTable();
        List<TaxTableEntry> taxTableEntrys = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            taxTableEntrys.add(this.generatorTaxTableEntry());
        }
        taxTable.setTaxTableEntries(taxTableEntrys);
        return taxTable;
    }
    
    private BillingAddress generatorBillingAddress() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setAddressDetail("Morada do Cliente");
        billingAddress.setCity("Luanda");
        billingAddress.setCountry("AO");
        return billingAddress;
    }
    
    private ShipFromAddress generatorShipFromAddress() {
        ShipFromAddress shipFromAddress = new ShipFromAddress();
        shipFromAddress.setAddressDetail("Morada do Cliente");
        shipFromAddress.setCity("Luanda");
        shipFromAddress.setCountry("AO");
        return shipFromAddress;
    }
    
    private TaxTableEntry generatorTaxTableEntry() {
        TaxTableEntry taxTableEntry = new TaxTableEntry();
        taxTableEntry.setTaxType("IVA");
        taxTableEntry.setTaxCountryRegion("AO");
        taxTableEntry.setTaxCode("ISE");
        taxTableEntry.setDescription("IVA Isento");
        taxTableEntry.setTaxPercentage("0.00");
        return taxTableEntry;
    }
    
}

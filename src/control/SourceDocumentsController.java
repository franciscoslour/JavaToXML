/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import model.Deductible;
import model.DocumentTotals;
import model.Invoice;
import model.PurchaseInvoices;
import model.SourceDocuments;

/**
 *
 * @author Pancho
 */
public class SourceDocumentsController {
    
    public SourceDocuments generatorSourceDocuments() {
        SourceDocuments sourceDocuments = new SourceDocuments();
        sourceDocuments.setPurchaseInvoices(this.generatorPurchaseInvoices());
        return sourceDocuments;
    }
    
    private PurchaseInvoices generatorPurchaseInvoices() {
        PurchaseInvoices purchaseInvoices = new PurchaseInvoices();
        purchaseInvoices.setNumberOfEntries("1");
        purchaseInvoices.setInvoices(this.generateInvoices());
        return purchaseInvoices;
    }
    
    private List<Invoice> generateInvoices() {
        List<Invoice> invoices = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Invoice invoice = new Invoice();
            invoice.setInvoiceNo("FT 2019A1/12360");
            invoice.setHash("ZPi2");
            invoice.setSourceID("ADM");
            invoice.setPeriod("5");
            invoice.setInvoiceDate("2019-06-09");
            invoice.setPurchaseType("FT");
            invoice.setSourceID("ADM190");
            invoice.setDocumentTotals(this.generatorDocumentTotals());
            invoices.add(invoice);
        }
        return invoices;
    }
    
    private DocumentTotals generatorDocumentTotals() {
        DocumentTotals documentTotals = new DocumentTotals();
        documentTotals.setTaxPayable("84000.00");
        documentTotals.setNetTotal("300000.00");
        documentTotals.setGrossTotal("342000.00");
        List<Deductible> deductibles = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            deductibles.add(this.generatorDeductible());
        }
        documentTotals.setDeductibles(deductibles);
        return documentTotals;
    }
    
    private Deductible generatorDeductible() {
        Deductible deductible = new Deductible();
        deductible.setTaxBase("200000.00");
        deductible.setDeductibleAmount("28000.00");
        deductible.setDeductiblePercentage("100.00");
        deductible.setDeductibleTaxType("OBC");
        return deductible;
    }
    
}

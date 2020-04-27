/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatoxml;

import control.XMLController;
import java.util.ArrayList;
import model.AuditFile;
import model.BillingAddress;
import model.CompanyAddress;
import model.Currency;
import model.Deductible;
import model.DocumentTotals;
import model.Header;
import model.Invoice;
import model.MasterFiles;
import model.PurchaseInvoices;
import model.ShipFromAddress;
import model.SourceDocuments;
import model.Supplier;
import model.TaxTable;
import model.TaxTableEntry;
import model.WithholdingTax;

/**
 *
 * @author Francisco Lourenço
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XMLController xmlController = new XMLController();
        //Main Object
        AuditFile auditFile = new AuditFile();
        //First Object
            Header header = new Header();
            header.setAuditFileVersion("1.01_01");
            header.setCompanyID("1428854 510310500");
            header.setTaxRegistrationNumber("5103105000");
            header.setTaxAccountingBasis("A");
            header.setCompanyName("AGT");
            header.setBusinessName("Mais AGT");
                header.setCompanyAddress(new CompanyAddress());
                header.getCompanyAddress().setAddressDetail("Avenida 4 de Fevereiro");
                header.getCompanyAddress().setCity("Luanda");
                header.getCompanyAddress().setPostalCode("000");
                header.getCompanyAddress().setCountry("AO");
            header.setFiscalYear("2019");
            header.setStartDate("2019-01-01");
            header.setEndDate("2019-12-31");
            header.setCurrencyCode("AOA");
            header.setDateCreated("2019-05-10");
            header.setTaxEntity("Global");
            header.setProductCompanyTaxID("54173354");
            header.setSoftwareValidationNumber("0/AGT/2020");
            header.setProductID("AGT/AGT");
            header.setProductVersion("01.01.20");
            auditFile.setHeader(header);
        //Second Object
            MasterFiles masterFiles = new MasterFiles();
            masterFiles.setSupplier(new Supplier());
            masterFiles.getSupplier().setSupplierID("ADM190");
            masterFiles.getSupplier().setAccountID("Desconhecido");
            masterFiles.getSupplier().setSupplierTaxID("1234567890");
            masterFiles.getSupplier().setCompanyName("FORNECEDOR EXEMPLO");
                masterFiles.getSupplier().setBillingAddress(new BillingAddress());
                masterFiles.getSupplier().getBillingAddress().setAddressDetail("Morada do Cliente");
                masterFiles.getSupplier().getBillingAddress().setCity("Luanda");
                masterFiles.getSupplier().getBillingAddress().setCountry("AO");
                masterFiles.getSupplier().setShipFromAddress(new ShipFromAddress());
                masterFiles.getSupplier().getShipFromAddress().setAddressDetail("Morada do Cliente");
                masterFiles.getSupplier().getShipFromAddress().setCity("Luanda");
                masterFiles.getSupplier().getShipFromAddress().setCountry("AO");
            masterFiles.getSupplier().setSelfBillingIndicator("0");
            masterFiles.setTaxTable(new TaxTable());
                masterFiles.getTaxTable().setTaxTableEntries(new ArrayList<TaxTableEntry>());
                    //First TaxBle
                    TaxTableEntry taxTableEntry1 = new TaxTableEntry();
                    taxTableEntry1.setTaxType("IVA");
                    taxTableEntry1.setTaxCountryRegion("AO");
                    taxTableEntry1.setTaxCode("NOR");
                    taxTableEntry1.setDescription("Normal");
                    taxTableEntry1.setTaxPercentage("14.000000");
                    //Second TaxBle
                    TaxTableEntry taxTableEntry2 = new TaxTableEntry();
                    taxTableEntry2.setTaxType("IVA");
                    taxTableEntry2.setTaxCountryRegion("AO");
                    taxTableEntry2.setTaxCode("ISE");
                    taxTableEntry2.setDescription("IVA Isento");
                    taxTableEntry2.setTaxPercentage("0.00");
                masterFiles.getTaxTable().getTaxTableEntries().add(taxTableEntry1);
                masterFiles.getTaxTable().getTaxTableEntries().add(taxTableEntry2);
            auditFile.setMasterFiles(masterFiles);
        //Third Object
            SourceDocuments sourceDocuments = new SourceDocuments();
                sourceDocuments.setPurchaseInvoices(new PurchaseInvoices());
                sourceDocuments.getPurchaseInvoices().setNumberOfEntries("1");
                sourceDocuments.getPurchaseInvoices().setInvoices(new ArrayList<>());
                    Invoice invoice1 = new Invoice();
                    invoice1.setInvoiceNo("FT 2019A1/12360");
                    invoice1.setHash("ZPi2");
                    invoice1.setSourceID("ADM");
                    invoice1.setPeriod("5");
                    invoice1.setInvoiceDate("2019-06-09");
                    invoice1.setPurchaseType("FT");
                    invoice1.setSourceID("ADM190");
                    invoice1.setDocumentTotals(new DocumentTotals());
                    invoice1.getDocumentTotals().setTaxPayable("84000.00");
                    invoice1.getDocumentTotals().setNetTotal("300000.00");
                    invoice1.getDocumentTotals().setGrossTotal("342000.00");
                    invoice1.getDocumentTotals().setDeductibles(new ArrayList<>());
                        Deductible deductible1 = new Deductible();
                        deductible1.setTaxBase("200000.00");
                        deductible1.setDeductibleAmount("28000.00");
                        deductible1.setDeductiblePercentage("100.00");
                        deductible1.setDeductibleTaxType("OBC");
                        Deductible deductible2 = new Deductible();
                        deductible2.setTaxBase("100000.00");
                        deductible2.setDeductibleAmount("14000.00");
                        deductible2.setDeductiblePercentage("100.00");
                        deductible2.setDeductibleTaxType("INV");
                    invoice1.getDocumentTotals().getDeductibles().add(deductible1);
                    invoice1.getDocumentTotals().getDeductibles().add(deductible2);
                    invoice1.getDocumentTotals().setCurrency(new Currency());
                    invoice1.getDocumentTotals().getCurrency().setCurrencyCode("USD");
                    invoice1.getDocumentTotals().getCurrency().setCurrencyAmount("482.27");
                    invoice1.getDocumentTotals().getCurrency().setExchangeRate("2077.98");
                    invoice1.setWithholdingTax(new WithholdingTax());
                    invoice1.getWithholdingTax().setWithholdingTaxType("IVA");
                    invoice1.getWithholdingTax().setWithholdingTaxDescription("50.00");
                    invoice1.getWithholdingTax().setWithholdingTaxType("21000.00");
                    Invoice invoice2 = new Invoice();
                    invoice2.setInvoiceNo("FT 2019A1/12361");
                    invoice2.setHash("ZPi2");
                    invoice2.setSourceID("ADM");
                    invoice2.setPeriod("5");
                    invoice2.setInvoiceDate("2019-06-09");
                    invoice2.setPurchaseType("FR");
                    invoice2.setSourceID("ADM190");
                    invoice2.setDocumentTotals(new DocumentTotals());
                    invoice2.getDocumentTotals().setTaxPayable("84000.00");
                    invoice2.getDocumentTotals().setNetTotal("300000.00");
                    invoice2.getDocumentTotals().setGrossTotal("342000.00");
                    invoice2.getDocumentTotals().setDeductibles(new ArrayList<>());
                        Deductible deductible3 = new Deductible();
                        deductible3.setTaxBase("200000.00");
                        deductible3.setDeductibleAmount("0.00");
                        deductible3.setDeductiblePercentage("0.00");
                        deductible3.setDeductibleTaxType("OBC");
                    invoice2.getDocumentTotals().getDeductibles().add(deductible3);
                    invoice2.setWithholdingTax(new WithholdingTax());
                    invoice2.getWithholdingTax().setWithholdingTaxType("IVA");
                    invoice2.getWithholdingTax().setWithholdingTaxDescription("0.00");
                    invoice2.getWithholdingTax().setWithholdingTaxType("0.00");
                sourceDocuments.getPurchaseInvoices().getInvoices().add(invoice1);
                sourceDocuments.getPurchaseInvoices().getInvoices().add(invoice2);
            auditFile.setSourceDocuments(sourceDocuments);
        //Convert The Obect To XML
        xmlController.convert(auditFile);
    }

}

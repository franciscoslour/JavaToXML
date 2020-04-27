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
import model.Header;
import model.MasterFiles;
import model.PurchaseInvoices;
import model.ShipFromAddress;
import model.SourceDocuments;
import model.Supplier;
import model.TaxTable;

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
        header.setAuditFileVersion("");
        header.setCompanyID("");
        header.setTaxRegistrationNumber("");
        header.setTaxAccountingBasis("");
        header.setCompanyName("");
        header.setBusinessName("");
        header.setCompanyAddress(new CompanyAddress());
        header.getCompanyAddress().setAddressDetail("");
        header.getCompanyAddress().setCity("");
        header.getCompanyAddress().setPostalCode("");
        header.getCompanyAddress().setCountry("");
        header.setFiscalYear("");
        header.setStartDate("");
        header.setEndDate("");
        header.setCurrencyCode("");
        header.setDateCreated("");
        header.setTaxEntity("");
        header.setProductCompanyTaxID("");
        header.setSoftwareValidationNumber("");
        header.setProductID("");
        header.setProductVersion("");
        //Second Object
        MasterFiles masterFiles = new MasterFiles();
        masterFiles.setSupplier(new Supplier());
        masterFiles.getSupplier().setSupplierID("");
        masterFiles.getSupplier().setAccountID("");
        masterFiles.getSupplier().setSupplierTaxID("");
        masterFiles.getSupplier().setCompanyName("");
        masterFiles.getSupplier().setBillingAddress(new BillingAddress());
        masterFiles.getSupplier().getBillingAddress().setAddressDetail("");
        masterFiles.getSupplier().getBillingAddress().setAddressDetail("");
        masterFiles.getSupplier().getBillingAddress().setCity("");
        masterFiles.getSupplier().getBillingAddress().setCountry("");
        masterFiles.getSupplier().setSelfBillingIndicator("");
        masterFiles.getSupplier().setShipFromAddress(new ShipFromAddress());
        masterFiles.getSupplier().getShipFromAddress().setAddressDetail("");
        masterFiles.getSupplier().getShipFromAddress().setCity("");
        masterFiles.getSupplier().getShipFromAddress().setCountry("");
        masterFiles.setTaxTable(new TaxTable());
        masterFiles.getTaxTable().setTaxTableEntry(new ArrayList<Object>());
        //Third Object
        SourceDocuments sourceDocuments = new SourceDocuments();
        sourceDocuments.setPurchaseInvoices(new PurchaseInvoices());
        

        auditFile.setHeader(header);
        auditFile.setMasterFiles(masterFiles);
        auditFile.setSourceDocuments(sourceDocuments);
        //Convert The Obect To XML
        xmlController.convert(auditFile);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CompanyAddress;

/**
 *
 * @author Pancho
 */
public class HeaderController {

    public model.Header generatorHeader() {
        model.Header header = new model.Header();
        header.setAuditFileVersion("1.01_01");
        header.setCompanyID("1428854 510310500");
        header.setTaxRegistrationNumber("5103105000");
        header.setTaxAccountingBasis("A");
        header.setCompanyName("AGT");
        header.setBusinessName("Mais AGT");
        header.setCompanyAddress(this.generatorCompanyAdress());
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
        return header;
    }
    
    private CompanyAddress generatorCompanyAdress(){
        CompanyAddress companyAddress = new CompanyAddress();
        companyAddress.setAddressDetail("Avenida 4 de Fevereiro");
        companyAddress.setCity("Luanda");
        companyAddress.setPostalCode("000");
        companyAddress.setCountry("AO");
        return companyAddress;
    }

}

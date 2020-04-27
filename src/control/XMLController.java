/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileOutputStream;
import java.io.StringWriter;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import model.AuditFile;
/**
 *
 * @author Francisco Lourenço
 */
public class XMLController {
    
    public void convert(AuditFile auditFile){
         try{
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(AuditFile.class);
             
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            //Print XML String to Console
            StringWriter sw = new StringWriter();
             
            //Write XML to StringWriter
            jaxbMarshaller.marshal(auditFile, sw);
       
            //Verify XML Content
            String xmlContent = sw.toString();
            System.out.println( xmlContent );
           
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}

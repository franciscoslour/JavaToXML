/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatoxml;

import control.HeaderController;
import control.MasterFilesController;
import control.SourceDocumentsController;
import control.XMLController;
import model.AuditFile;

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
        HeaderController headerController = new HeaderController();
        auditFile.setHeader(headerController.generatorHeader());
        //Second Object
        MasterFilesController masterFilesController = new MasterFilesController();
        auditFile.setMasterFiles(masterFilesController.generatorMasterFiles());
        //Third Object
        SourceDocumentsController sourceDocumentsController = new SourceDocumentsController();
        auditFile.setSourceDocuments(sourceDocumentsController.generatorSourceDocuments());
        //Convert The Obect To XML
        xmlController.convert(auditFile);
    }

}

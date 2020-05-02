/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.AuditFile;


/**
 *
 * @author Pancho
 */
public class AuditFileController {
    
    private HeaderController hearderController = null;
    private MasterFilesController masterFilesController = null;
    private SourceDocumentsController sourceDocumentsController = null;
    
    public AuditFileController(){
        this.hearderController = new HeaderController();
        this.masterFilesController = new MasterFilesController();
        this.sourceDocumentsController = new SourceDocumentsController();
    }

    public AuditFile generatorAuditFile() {
        AuditFile auditFile = new AuditFile();
        auditFile.setHeader(this.hearderController.generatorHeader());
        auditFile.setMasterFiles(masterFilesController.generatorMasterFiles());
        auditFile.setSourceDocuments(sourceDocumentsController.generatorSourceDocuments());
        return auditFile;
    }

}

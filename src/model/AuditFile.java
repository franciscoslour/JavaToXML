package model;

public class AuditFile {
	Header HeaderObject;
	MasterFiles MasterFilesObject;
	SourceDocuments SourceDocumentsObject;

	// Getter Methods

	public Header getHeader() {
		return HeaderObject;
	}

	public MasterFiles getMasterFiles() {
		return MasterFilesObject;
	}

	public SourceDocuments getSourceDocuments() {
		return SourceDocumentsObject;
	}

	// Setter Methods

	public void setHeader(Header HeaderObject) {
		this.HeaderObject = HeaderObject;
	}

	public void setMasterFiles(MasterFiles MasterFilesObject) {
		this.MasterFilesObject = MasterFilesObject;
	}

	public void setSourceDocuments(SourceDocuments SourceDocumentsObject) {
		this.SourceDocumentsObject = SourceDocumentsObject;
	}
}

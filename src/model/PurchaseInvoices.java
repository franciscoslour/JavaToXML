package model;

import java.util.ArrayList;

public class PurchaseInvoices {
	private String NumberOfEntries;
	ArrayList<Object> Invoice = new ArrayList<Object>();

	public String getNumberOfEntries() {
		return NumberOfEntries;
	}

	public void setNumberOfEntries(String numberOfEntries) {
		NumberOfEntries = numberOfEntries;
	}

	public ArrayList<Object> getInvoice() {
		return Invoice;
	}

	public void setInvoice(ArrayList<Object> invoice) {
		Invoice = invoice;
	}

}

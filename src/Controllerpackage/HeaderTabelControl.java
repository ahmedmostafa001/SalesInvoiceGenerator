package Controllerpackage;

import Modelpackage.InvoiceHeader;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class HeaderTabelControl extends DefaultTableModel {

    private String[] Names = {"No.", "CustomerName","Date",  "Total"};
    private ArrayList<InvoiceHeader> invoices;

    public HeaderTabelControl(ArrayList<InvoiceHeader> invoices) {
        this.Names = Names;
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        if(this.invoices ==null){
         invoices=new  ArrayList<>();
        }
        return invoices.size();
    }

    public HeaderTabelControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public int getColumnCount() {
        return Names.length;
    }

    @Override
    public void removeRow(int row) {
    invoices.remove(row);
    }
    

    @Override
    public Object getValueAt(int row, int colume) {

    	InvoiceHeader inv = invoices.get(row);

        if(colume==0) {
            return inv.getNum();
        } else if(colume==1) {
            return inv.getCustomerName();
        }else if(colume==2) {
            return inv.getDate();
        }else if(colume==3) {
            return inv.getInvTotal();
        }else {
            return null;
    }
    }

    @Override
    public String getColumnName(int column) {
        return Names[column];
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

}

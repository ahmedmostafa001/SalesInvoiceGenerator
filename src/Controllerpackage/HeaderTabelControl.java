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


	@Override
    public int getColumnCount() {
        return Names.length;
    }

    @Override
    public void removeRow(int row) {
    invoices.remove(row);
    }
    

    @Override
    public Object getValueAt(int row, int cloume) {

        InvoiceHeader inv = invoices.get(row);
        switch (cloume) {
            case 0:
                return inv.getNum();
            case 1:
                return inv.getCustomerName();
            case 2:
                return inv.getDate();
            case 3:
                return inv.getInvTotal();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return Names[column];
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

}

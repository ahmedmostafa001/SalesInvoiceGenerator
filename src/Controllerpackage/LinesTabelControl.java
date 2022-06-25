package Controllerpackage;

import Modelpackage.InvoiceLine;
import java.util.ArrayList;
//import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class LinesTabelControl extends DefaultTableModel {

    private String[] Names = {"ProducyName", "ProductPrice", "Amount", "TotalPrice"};
    private ArrayList<InvoiceLine> Lines;

    public LinesTabelControl(ArrayList<InvoiceLine> Lines) {
        this.Lines = Lines;
    }

    @Override
    public int getRowCount() {
        if(this.Lines==null){
        Lines =new  ArrayList<>();
        }
        
        return Lines.size();
    }

    @Override
    public int getColumnCount() {
        return Names.length;
    }

    @Override
    public void removeRow(int row)
    {
    	if(Lines.remove(row)==null) {
    		 System.out.print(false);
    }
    	Lines.remove(row);
    }

    
    @Override
    public Object getValueAt(int row, int colume) {

        InvoiceLine inv = Lines.get(row);

        if(colume==0)
        {
        	return inv.getProduct();
        }else if(colume==1)
        {
        	return inv.getPrice();
        }else if(colume==2)
        {
        	return inv.getCount();
        }else if(colume==3)
        {
        	return inv.getLineTotal();
        }else
        {
        	return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return Names[column]; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<InvoiceLine> getInvoices() {
        return Lines;
    }

}

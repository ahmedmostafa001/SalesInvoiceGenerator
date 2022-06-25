package Modelpackage;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    
    private int num;
    private Date date;
    private String CustomerName;
    private double invTotal;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int num, Date date, String customerName) {
        this.num = num;
        this.date = date;
        this.CustomerName = customerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getInvTotal() {
        return invTotal;
    }

    public void setInvTotal(double invTotal) {
        this.invTotal = invTotal;
    }

    public ArrayList<InvoiceLine> getLines() {
        if(lines ==null)
            lines=new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    public void addLine(InvoiceLine Li){
        getLines().add(Li);
        setInvTotal(getInvTotal()+Li.getLineTotal());
    
    }
    
    
}

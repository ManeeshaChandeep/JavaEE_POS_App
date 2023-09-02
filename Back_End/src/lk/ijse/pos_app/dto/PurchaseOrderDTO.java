package lk.ijse.pos_app.dto;


import java.util.Date;

public class PurchaseOrderDTO {
    String oId;
    int orderQty;
    double cash;
    double balance;
    Date date;
    String cusId;
    String itemCode;

    public PurchaseOrderDTO() {
    }

    public PurchaseOrderDTO(String oId, double cash, double balance, Date date, String cusId) {
        this.oId = oId;
        this.cash = cash;
        this.balance = balance;
        this.date = date;
        this.cusId = cusId;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}



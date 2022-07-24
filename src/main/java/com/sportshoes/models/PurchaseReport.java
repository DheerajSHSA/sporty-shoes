package com.sportshoes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PurchaseReport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int purchaseid;
    int userid;
    int productid;
    String dateofpurchase;
    public PurchaseReport() {
    }
    public PurchaseReport(int purchaseid, int userid, int productid, String dateofpurchase) {
        this.purchaseid = purchaseid;
        this.userid = userid;
        this.productid = productid;
        this.dateofpurchase = dateofpurchase;
    }
    public int getPurchaseid() {
        return purchaseid;
    }
    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getProductid() {
        return productid;
    }
    public void setProductid(int productid) {
        this.productid = productid;
    }
    public String getDateofpurchase() {
        return dateofpurchase;
    }
    public void setDateofpurchase(String dateofpurchase) {
        this.dateofpurchase = dateofpurchase;
    }
    @Override
    public String toString() {
        return "PurchaseReport [dateofpurchase=" + dateofpurchase + ", productid=" + productid + ", purchaseid="
                + purchaseid + ", userid=" + userid + "]";
    }

    
    
}

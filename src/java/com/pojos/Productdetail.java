package com.pojos;
// Generated Nov 1, 2013 7:16:30 PM by Hibernate Tools 3.6.0



/**
 * Productdetail generated by hbm2java
 */
public class Productdetail  implements java.io.Serializable {


     private Integer pdId;
     private Product product;
     private String productDescr;
     private String productDescrShort;
     private String productColor;

    public Productdetail() {
    }

    public Productdetail(Product product, String productDescr, String productDescrShort, String productColor) {
       this.product = product;
       this.productDescr = productDescr;
       this.productDescrShort = productDescrShort;
       this.productColor = productColor;
    }
   
    public Integer getPdId() {
        return this.pdId;
    }
    
    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public String getProductDescr() {
        return this.productDescr;
    }
    
    public void setProductDescr(String productDescr) {
        this.productDescr = productDescr;
    }
    public String getProductDescrShort() {
        return this.productDescrShort;
    }
    
    public void setProductDescrShort(String productDescrShort) {
        this.productDescrShort = productDescrShort;
    }
    public String getProductColor() {
        return this.productColor;
    }
    
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }




}



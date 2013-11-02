package com.pojos;
// Generated Nov 1, 2013 7:16:30 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Productcustomattr generated by hbm2java
 */
public class Productcustomattr  implements java.io.Serializable {


     private Integer pcaId;
     private Product product;
     private String manufacturer;
     private Date arrivalDate;
     private byte[] productImage;

    public Productcustomattr() {
    }

    public Productcustomattr(Product product, String manufacturer, Date arrivalDate, byte[] productImage) {
       this.product = product;
       this.manufacturer = manufacturer;
       this.arrivalDate = arrivalDate;
       this.productImage = productImage;
    }
   
    public Integer getPcaId() {
        return this.pcaId;
    }
    
    public void setPcaId(Integer pcaId) {
        this.pcaId = pcaId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Date getArrivalDate() {
        return this.arrivalDate;
    }
    
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public byte[] getProductImage() {
        return this.productImage;
    }
    
    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }




}


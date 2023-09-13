package com.example.msusers.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class BillDTO {
    private String idBill;
    private String customerBill;
    private String user_id;
    private String productBill;
    private Double totalPrice;

    public BillDTO(String idBill, String customerBill,String user_id, String productBill, Double totalPrice) {
        this.idBill = idBill;
        this.customerBill = customerBill;
        this.user_id = user_id;
        this.productBill = productBill;
        this.totalPrice = totalPrice;
    }

    public BillDTO() {
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(String customerBill) {
        this.customerBill = customerBill;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String idUser) {
        this.user_id = user_id;
    }

    public String getProductBill() {
        return productBill;
    }

    public void setProductBill(String productBill) {
        this.productBill = productBill;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

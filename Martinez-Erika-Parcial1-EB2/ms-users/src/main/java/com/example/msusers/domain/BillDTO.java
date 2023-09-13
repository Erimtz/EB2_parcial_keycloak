package com.example.msusers.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class BillDTO {
    private String idBill;
    private String customerBill;

    private String idUser;
    private String productBill;
    private Double totalPrice;

    public BillDTO(String idBill, String customerBill,String idUser, String productBill, Double totalPrice) {
        this.idBill = idBill;
        this.customerBill = customerBill;
        this.idUser = idUser;
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

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

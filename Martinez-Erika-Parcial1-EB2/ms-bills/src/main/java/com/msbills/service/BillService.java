package com.msbills.service;

import com.msbills.models.Bill;
import com.msbills.repositories.BillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BillService {

    private final BillRepository repository;

    public List<Bill> getAllBill() {
        return repository.findAll();
    }

    public boolean createBill(Bill bill) {
        if (bill == null || bill.getTotalPrice() <= 0 || bill.getCustomerBill() == null || bill.getProductBill() == null) {
            return false;
        }

        try {
            repository.save(bill);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Bill> getBillsByUserId(String userId) {
        List<Bill> userBills = repository.findByCustomerBill(userId);
        return userBills;
    }



}

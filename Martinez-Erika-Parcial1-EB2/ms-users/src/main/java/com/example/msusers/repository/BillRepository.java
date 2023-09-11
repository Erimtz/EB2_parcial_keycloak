package com.example.msusers.repository;

import com.example.msusers.domain.BillDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class BillRepository {

    private FeignBillRepository feingBillRespository;

    public BillRepository(FeignBillRepository feingBillRespository) {
        this.feingBillRespository = feingBillRespository;
    }

    public  BillDTO findByUserId(Integer id){
        ResponseEntity<BillDTO> response = feingBillRespository.findByUserId(id);
        return response.getBody();
    }
}



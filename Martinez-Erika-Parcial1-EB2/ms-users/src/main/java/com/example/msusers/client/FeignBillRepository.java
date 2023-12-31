package com.example.msusers.client;

import com.example.msusers.configuration.feign.OAuthFeignConfig;
import com.example.msusers.domain.BillDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "ms-bills",url = "http://localhost:${PORT:0}", configuration = OAuthFeignConfig.class)
public interface FeignBillRepository {
    @RequestMapping(method = RequestMethod.GET, value = "/bills/find")
    ResponseEntity<BillDTO> findByUserId(@RequestParam String id);
}

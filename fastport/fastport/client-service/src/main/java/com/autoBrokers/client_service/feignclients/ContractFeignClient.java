package com.autoBrokers.client_service.feignclients;

import com.autoBrokers.client_service.model.Comment;
import com.autoBrokers.client_service.model.Contract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "contract-service",url = "http://localhost:8080")
@RequestMapping("/api/v1/contracts")
public interface ContractFeignClient {

    @PostMapping()
    public Contract save(@RequestBody Contract contract);

    @GetMapping("/client/{id}")
    public List<Contract> getContracts(@PathVariable("id") Long clientId);
}

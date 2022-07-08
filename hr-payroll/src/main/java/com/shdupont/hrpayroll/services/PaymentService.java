package com.shdupont.hrpayroll.services;

import com.shdupont.hrpayroll.entities.Payment;

import com.shdupont.hrpayroll.entities.Worker;
import com.shdupont.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

   @Autowired
   private WorkerFeignClient workerFeignClient;
    public Payment getPayment(long workerId, int days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}

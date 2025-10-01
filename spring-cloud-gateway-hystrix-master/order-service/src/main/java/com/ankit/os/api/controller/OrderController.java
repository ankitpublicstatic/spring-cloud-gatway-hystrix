package com.ankit.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ankit.os.api.common.TransactionRequest;
import com.ankit.os.api.common.TransactionResponse;
import com.ankit.os.api.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  private OrderService service;

  @PostMapping("/bookOrder")
  public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
    try {
      return service.saveOrder(request);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }
}

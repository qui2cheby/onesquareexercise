package org.unosquare.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.unosquare.service.OrderService;
import org.unosquare.vo.Order;
import org.unosquare.vo.Response;

@RestController
//@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/order/getBy/{idOrder}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getByOrderId(@PathVariable Long idOrder) {
        Response response = new Response();
        response.datos = this.orderService.getBy(idOrder);
        response.codigo = 200;
        response.mensaje = "OK";
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/order/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> save(@RequestBody Order order) {
//        log.info("#equiro order {}", order);
        Response response = new Response();
        response.datos = orderService.saveOrder(order);
        response.codigo = 200;
        response.mensaje = "OK";
        return ResponseEntity.ok(response);
    }
}

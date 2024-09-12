package org.unosquare.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.unosquare.service.ProductService;
import org.unosquare.vo.Response;

@RestController
//@Slf4j
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/product/getBy/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getBy(@PathVariable Long id) {
//        log.info("entra");
        Response response = new Response();
        response.datos = this.productService.getBy(id);
        response.codigo = 200;
        response.mensaje = "OK";
        return ResponseEntity.ok(response);
    }
}

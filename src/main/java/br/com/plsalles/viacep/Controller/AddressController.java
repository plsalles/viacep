package br.com.plsalles.viacep.Controller;


import main.java.br.com.plsalles.viacep.Service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/v1/address")
public class AddressController {

    @Autowired
    private IAddressService _service;

    @GetMapping("/{cep}")
    public ResponseEntity<String> buscarCEP(@PathVariable String cep) throws IOException, InterruptedException {
        return ResponseEntity.status(HttpStatus.OK).body(_service.BuscarCEP(cep));
    }
}
package br.com.plsalles.viacep.Service;


import br.com.plsalles.viacep.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AddressService implements IAddressService {

    @Autowired
    public AddressRepository _repository;

    @Override
    public String BuscarCEP(String cep) throws IOException, InterruptedException {

        return _repository.BuscarCEP(cep);
    }

}
package br.com.plsalles.viacep.Service;

import java.io.IOException;

public interface IAddressService {
    String BuscarCEP(String cep) throws IOException, InterruptedException;
}

package br.com.plsalles.viacep.Repository;


import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Repository
public class AddressRepository {

    public String BuscarCEP(String cep) throws IOException, InterruptedException {
        final String URL_ViaCEP= "http://viacep.com.br/ws/";

        // create a client
        var client = HttpClient.newHttpClient();

// create a request
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_ViaCEP + cep + "/json/"))
                .build();

// use the client to send the request
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

// the response:
        System.out.println(response.body());
        return response.body();
    }
}

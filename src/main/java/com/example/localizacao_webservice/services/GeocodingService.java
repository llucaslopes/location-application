package com.example.localizacao_webservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class GeocodingService {

    private static final String API_KEY = "SUA_API_KEY"; // Substitua pela sua chave de API
    private final RestTemplate restTemplate;

    public GeocodingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getGeocode(double lat, double lon) {
        String url = "https://api.opencagedata.com/geocode/v1/json?q=" + lat + "+" + lon + "&key=" + API_KEY;

        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return response.getBody(); // Retorna o corpo da resposta
        } catch (Exception e) {
            // Tratar exceções caso a API externa não esteja disponível
            return "Erro ao acessar a API: " + e.getMessage();
        }
    }
}
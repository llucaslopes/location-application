package main.java.com.example.localizacao_webservice.controler;

import com.localizacao_webservice.model.Coordenadas;
import com.localizacao_webservice.service.GeocodingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {

    private final GeocodingService geocodingService;

    public LocationController(GeocodingService geocodingService) {
        this.geocodingService = geocodingService;
    }

@PostMapping("/processar")
public ResponseEntity<String> processarCoordenadas(@RequestBody Coordenadas coordenadas) {
    double lat = coordenadas.getLat();
    double lon = coordenadas.getLon();

    String resultadoGeocode = geocodingService.getGeocode(lat, lon);

    return ResponseEntity.ok("Processado com sucesso: " + resultadoGeocode);
}


@GetMapping("/sobre")
public ResponseEntity<Map<String, String>> sobre() {
    Map<String, String> info = new HashMap<>();
    info.put("estudante", "Seu Nome");
    info.put("projeto", "Serviço de Localização");
    return ResponseEntity.ok(info);
}

package consumindo.api.consumindoApi.service;

import consumindo.api.consumindoApi.model.Satelite;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class SateliteService {

    public List<Satelite> listaSatelite(){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        Satelite satelite = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544", Satelite.class);

        List<Satelite> lista = new ArrayList<>();
        lista.add(satelite);

        return lista;
    }


}

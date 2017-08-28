package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by dfs1 on 28-08-17.
 */
@RestController
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    @PostConstruct
    public void init() {
        Auto auto = new Auto();

        auto.setAnioFab(1234);
        auto.setMarca("Lada");
        auto.setModelo("ASC");

        autoRepository.save(auto);

    }

    @GetMapping
    public List<Auto> getAll(@RequestParam(value = "marca", required = false, defaultValue = "") String marca) {
        if (!marca.isEmpty()) {
            return autoRepository.findByMarca(marca);
        } else {
            return autoRepository.findAll();
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Auto add(@RequestBody Auto auto) {
        return autoRepository.save(auto);
    }
}

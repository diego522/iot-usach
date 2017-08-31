package com.example.demo.controller;

import com.example.demo.domain.Auto;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dfs1 on 28-08-17.
 */
@RestController
public class AutoController {

    @Qualifier(value = "autoServiceBD")
    @Autowired
    private AutoService autoService;


    /**
     * Obtiene todos los vehículos desde la BD
     *
     * @param marca Indica la marca en el caso de necesitarla
     * @return
     */
    @GetMapping
    public List<Auto> getAll(@RequestParam(value = "marca", required = false, defaultValue = "") String marca) {
        return autoService.findByMarca(marca);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Auto add(@RequestBody Auto auto) {
        return autoService.save(auto);
    }
}

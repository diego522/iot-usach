package com.example.demo.service.impl;

import com.example.demo.domain.Auto;
import com.example.demo.repository.AutoRepository;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by dfs1 on 30-08-17.
 */
@Qualifier(value = "autoServiceBD")
@Service
public class AutoServiceImpl implements AutoService {

    @Value("${arduinoPort:COM4}")
    public String puerto;

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

    @Override
    public List<Auto> findByMarca(String marca) {
        if (!marca.isEmpty()) {
            return findByMarca(marca);
        } else {
            return findAll();
        }
    }

    @Override
    public List<Auto> findAll() {
        return autoRepository.findAll();
    }

    @Override
    public Auto save(Auto auto) {
        return autoRepository.save(auto);
    }
}

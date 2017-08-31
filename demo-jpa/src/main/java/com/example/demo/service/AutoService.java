package com.example.demo.service;

import com.example.demo.domain.Auto;

import java.util.List;

/**
 * Created by dfs1 on 30-08-17.
 */
public interface AutoService {

    List<Auto> findAll();

    Auto save(Auto auto);

    List<Auto> findByMarca(String marca);
}

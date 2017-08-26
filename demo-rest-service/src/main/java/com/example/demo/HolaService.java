package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dfs1 on 23-08-17.
 */

public class HolaService {


    public String hola() {
        return "Hola desde el servicio";
    }
}

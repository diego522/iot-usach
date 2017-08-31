package com.example.demo.repository;

import com.example.demo.domain.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dfs1 on 28-08-17.
 */
public interface AutoRepository extends JpaRepository<Auto, Long> {

    List<Auto> findByMarca(String marca);
}

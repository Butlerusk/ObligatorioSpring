package com.example.ObligatorioSpring.repository;

import com.example.ObligatorioSpring.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}

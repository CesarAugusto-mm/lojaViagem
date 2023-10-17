package com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.Model.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Integer>{
	
}

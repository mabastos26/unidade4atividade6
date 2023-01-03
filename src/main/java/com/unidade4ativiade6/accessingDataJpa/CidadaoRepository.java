package com.unidade4ativiade6.accessingDataJpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.unidade4ativiade6.model.Cidadao;


public interface CidadaoRepository extends CrudRepository<Cidadao, Long>{
    List<Cidadao> findAll(); 
}

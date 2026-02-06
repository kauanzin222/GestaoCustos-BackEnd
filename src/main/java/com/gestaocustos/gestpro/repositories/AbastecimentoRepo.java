package com.gestaocustos.gestpro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaocustos.gestpro.models.Abastecimento;
import com.gestaocustos.gestpro.models.Posto;

import java.util.List;



public interface AbastecimentoRepo extends JpaRepository<Abastecimento, Integer> {

    List<Abastecimento> findByPosto(Posto posto);
}

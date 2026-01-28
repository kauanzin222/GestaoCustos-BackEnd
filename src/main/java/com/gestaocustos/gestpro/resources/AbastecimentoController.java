package com.gestaocustos.gestpro.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.gestaocustos.gestpro.repositories.AbastecimentoRepo;
import com.gestaocustos.gestpro.services.AbastecimentoService;

@RestController
@CrossOrigin
public class AbastecimentoController {
    @Autowired
    public AbastecimentoRepo abastecimentoRepo;
    @Autowired
    public AbastecimentoService abastecimentoService;
    
}

package com.esdrasdev.api_avaliacao_circuit_breaker.domain;

import java.util.List;
import java.util.Optional;

public interface AvaliacaoRepository {

    void save(Avaliacao avaliacao);
    Optional<Avaliacao> getOne(Long id);
    List<Avaliacao> getAll();

}

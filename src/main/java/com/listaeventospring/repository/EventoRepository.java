package com.listaeventospring.repository;

import com.listaeventospring.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String>{
}

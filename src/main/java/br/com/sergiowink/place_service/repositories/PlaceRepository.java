package br.com.sergiowink.place_service.repositories;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sergiowink.place_service.entities.PlaceEntity;

@Repository
public interface PlaceRepository extends ReactiveCrudRepository<PlaceEntity, Long>, ReactiveQueryByExampleExecutor<PlaceEntity> {
    
}

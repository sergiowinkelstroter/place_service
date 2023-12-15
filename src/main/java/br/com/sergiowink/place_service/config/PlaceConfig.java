package br.com.sergiowink.place_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.sergiowink.place_service.repositories.PlaceRepository;
import br.com.sergiowink.place_service.useCases.PlaceUseCase;

@Configuration
@EnableR2dbcAuditing // Para preencher o createdAt e updatedAt
public class PlaceConfig {
  @Bean
  PlaceUseCase placeService(PlaceRepository placeRepository) {
    return new PlaceUseCase(placeRepository);
  }
}

package br.com.sergiowink.place_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sergiowink.place_service.PlaceMapper;
import br.com.sergiowink.place_service.dto.PlaceRequestDTO;
import br.com.sergiowink.place_service.dto.PlaceResponseDTO;
import br.com.sergiowink.place_service.useCases.PlaceUseCase;
import jakarta.validation.Valid;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/places")
public class PlaceController {
    
    @Autowired 
    private PlaceUseCase placeUseCase;

    @PostMapping
    public ResponseEntity<Mono<PlaceResponseDTO>> create(@Valid @RequestBody PlaceRequestDTO request) {
      var placeResponse = placeUseCase.create(request).map(PlaceMapper::toResponse);
      return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse);
    }
}

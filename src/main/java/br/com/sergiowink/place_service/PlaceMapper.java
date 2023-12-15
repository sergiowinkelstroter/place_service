package br.com.sergiowink.place_service;

import org.springframework.util.StringUtils;

import br.com.sergiowink.place_service.dto.PlaceRequestDTO;
import br.com.sergiowink.place_service.dto.PlaceResponseDTO;
import br.com.sergiowink.place_service.entities.PlaceEntity;

public class PlaceMapper {
  public static PlaceEntity updatePlaceFromDTO(PlaceRequestDTO placeRequest, PlaceEntity place) {
    final String name = StringUtils.hasText(placeRequest.name()) ? placeRequest.name() : place.name();
    final String city = StringUtils.hasText(placeRequest.city()) ? placeRequest.city() : place.city();
    final String state = StringUtils.hasText(placeRequest.state()) ? placeRequest.state() : place.state();
    return new PlaceEntity(place.id(), name, place.slug(), city, state, place.createdAt(), place.updatedAt());
  }

  public static PlaceResponseDTO toResponse(PlaceEntity place) {
    return new PlaceResponseDTO(place.name(), place.slug(),
        place.city(), place.state(), place.createdAt(), place.updatedAt());
  }
}

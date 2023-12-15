package br.com.sergiowink.place_service.dto;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequestDTO(
    @NotBlank String name, @NotBlank String city, @NotBlank String state) {

}

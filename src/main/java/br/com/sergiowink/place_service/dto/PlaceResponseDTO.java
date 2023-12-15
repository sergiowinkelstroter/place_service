package br.com.sergiowink.place_service.dto;

import java.time.LocalDateTime;

public record PlaceResponseDTO(String name, String slug, String city, String state,
        LocalDateTime createdAt, LocalDateTime updatedAt) {

}

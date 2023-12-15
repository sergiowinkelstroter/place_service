package br.com.sergiowink.place_service.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.validation.constraints.NotBlank;

public record PlaceEntity(
        @Id Long id, @NotBlank String name, String slug,
        @NotBlank String city,
        @NotBlank String state,
        @CreatedDate LocalDateTime createdAt,
        @LastModifiedDate LocalDateTime updatedAt) {

}
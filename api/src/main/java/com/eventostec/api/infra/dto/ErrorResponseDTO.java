package com.eventostec.api.infra.dto;

import org.springframework.http.HttpStatus;

public record ErrorResponseDTO(HttpStatus status, String message) {
}

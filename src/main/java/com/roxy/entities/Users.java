package com.roxy.entities;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
// import jakarta.validation.constraints.NotNull;

@MappedEntity
public record Users(
        @Id @NonNull Long id,
        @NonNull String username,
        @NonNull String password) {

}
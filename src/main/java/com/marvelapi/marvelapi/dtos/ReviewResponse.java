package com.marvelapi.marvelapi.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class ReviewResponse {
    private UUID id;

    private String title;

    private String description;

    private UUID userId;

    private UUID movieId;
}

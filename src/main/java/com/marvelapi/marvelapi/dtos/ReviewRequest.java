package com.marvelapi.marvelapi.dtos;


import com.marvelapi.marvelapi.models.User;
import lombok.Data;

import java.util.UUID;

@Data
public class ReviewRequest {

    private String title;

    private String description;

    private UUID userId;

    private UUID movieId;
}

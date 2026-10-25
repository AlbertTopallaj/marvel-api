package com.marvelapi.marvelapi.repositories;

import com.marvelapi.marvelapi.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID> {
    List<Review> findByMovie_Id(UUID movieId);
    List<Review> findByAuthor_Id(UUID authorId);
}

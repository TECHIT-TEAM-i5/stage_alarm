package com.example.stagealarm.genre.repo;

import com.example.stagealarm.genre.entity.Genre;
import com.example.stagealarm.genre.entity.GenreSubscribe;
import com.example.stagealarm.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GenreSubscribeRepo extends JpaRepository<GenreSubscribe, Long> {
    Optional<GenreSubscribe> findByUserEntityAndGenre(UserEntity userEntity, Genre genre);

    List<GenreSubscribe> findByGenreId(Long genreId);
}

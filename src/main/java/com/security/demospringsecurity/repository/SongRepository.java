package com.security.demospringsecurity.repository;

import com.security.demospringsecurity.model.Song;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByUserId (Long userId);
    Optional<Song> findByNameSongContaining(String song);
    List<Song> findAllByOrderByLikeSongDesc();
    List<Song> findAllByOrderByListenSongDesc();
    Optional<Song> findByMp3Url(String mp3Url);
}
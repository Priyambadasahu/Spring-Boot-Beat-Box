package com.kodnest.beatbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.beatbox.entity.Playlist;

public interface PlaylistRepository
 extends JpaRepository<Playlist, Integer>
 {

}

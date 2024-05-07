package com.kodnest.beatbox.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.beatbox.entity.Playlist;
import com.kodnest.beatbox.repository.PlaylistRepository;
import com.kodnest.beatbox.service.PlaylistService;
@Service
public class PlaylistServiceImpl implements PlaylistService 
{
	@Autowired
	PlaylistRepository playlistRepo;

@Override
	public void addplaylsit(Playlist playlist)
	{
		playlistRepo.save(playlist);
	}

@Override
	public List<Playlist> fetchAllPlaylist() 
	{
		List<Playlist> allplaylist =playlistRepo.findAll();
	
		return allplaylist ;
	}


	
}


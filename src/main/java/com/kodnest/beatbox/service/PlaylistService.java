package com.kodnest.beatbox.service;


import java.util.List;

import com.kodnest.beatbox.entity.Playlist;

public interface PlaylistService 
{

	public void addplaylsit(Playlist playlist);

	public List<Playlist> fetchAllPlaylist();
	
	

}

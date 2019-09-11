package com.example.springmongoDB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmongoDB.domain.Post;
import com.example.springmongoDB.repository.PostRepository;
import com.example.springmongoDB.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	
	}

	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}

}

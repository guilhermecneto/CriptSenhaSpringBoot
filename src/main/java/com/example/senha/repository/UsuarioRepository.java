package com.example.senha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.senha.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
	
	public Optional<UsuarioModel> findByLogin(String login);

}

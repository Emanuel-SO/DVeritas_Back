package com.dveritas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dveritas.model.Publicacion;



public interface PublicacionRepository extends JpaRepository<Publicacion, Long> { 

	   @Query("SELECT COUNT(p) FROM Publicacion p")
	    long contadorPublicaciones();
	
	   List<Publicacion> findByUsuarioId(Long usuarioId);
	}

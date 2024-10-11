package com.proyect.service;/*
package com.proyect.service;

import java.util.List;

import com.proyect.entity.Enlace;
import com.proyect.entity.Usuario;
import com.proyect.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validarSesion(String vLogin) {
		return usuarioRepository.iniciarSesion(vLogin);
	}	
	public List<Enlace> enlacesDelUsuario(Long codRol){
		return usuarioRepository.traerEnlacesDelUsuario(codRol);
	}

}






*/

package com.proyect.service;

import com.proyect.entity.Enlace;
import com.proyect.entity.Usuario;
import com.proyect.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario validarSesion(String vLogin) {
        return usuarioRepository.iniciarSesion(vLogin);
    }

    @Override
    public List<Enlace> enlacesDelUsuario(Long codRol) {
        return usuarioRepository.traerEnlacesDelUsuario(codRol);
    }

    @Override
    public Usuario insertar(Usuario a) {
        return usuarioRepository.save(a);
    }

    @Override
    public Usuario actualizar(Usuario a) {
        return usuarioRepository.save(a);
    }

    @Override
    public Optional<Usuario> buscar(Long cod) {
        return usuarioRepository.findById(cod);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void eliminar(Long cod) {
        usuarioRepository.deleteById(cod);
    }

}

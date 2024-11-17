package com.proyect.service;

import com.proyect.entity.Enlace;
import com.proyect.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario validarSesion(String vLogin);
    List<Enlace> enlacesDelUsuario(Long codRol);

    Usuario insertar(Usuario a);
    List<Usuario> listarUsuario();
    Usuario actualizar(Usuario a);
    void eliminar(Long cod);
    Optional<Usuario> buscar(Long cod);


}

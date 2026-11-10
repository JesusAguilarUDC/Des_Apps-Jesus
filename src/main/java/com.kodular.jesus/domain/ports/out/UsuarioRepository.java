package com.kodular.jesus.domain.ports;

import com.kodular.jesus.domain.model.Usuario;

import java.util.List;

public interface UsuarioRepository {

    Usuario guardar(Usuario usuario);

    Usuario buscarPorId(int id);

    List<Usuario> listar();

    Usuario actualizar(Usuario usuario);

    void eliminar(int id);
}
package com.kodular.jesus.domain.ports;

import com.kodular.jesus.domain.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario guardar(Usuario usuario);

    Usuario buscarPorId(int id);

    List<Usuario> listar();

    Usuario actualizar(int id, Usuario usuario);

    void eliminar(int id);
}
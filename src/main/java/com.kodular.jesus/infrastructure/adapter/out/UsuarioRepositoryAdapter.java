package com.example.usuario.infrastructure.adapter.out;

import com.example.usuario.domain.model.Usuario;
import com.example.usuario.domain.ports.UsuarioRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepository {

    private final List<Usuario> usuarios = new ArrayList<>();
    private int contadorId = 1L;

    @Override
    public Usuario guardar(Usuario usuario) {
        usuario.setId(contadorId++);
        usuarios.add(usuario);

        return usuario;
    }

    @Override
    public Usuario buscarPorId(int id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> listar() {
        return usuarios;
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
        Usuario usuarioExistente = buscarPorId(usuario.getId());

        if (usuarioExistente == null) {
            return null;
        }

        usuarioExistente.setUsername(usuario.getUsername());
        usuarioExistente.setPassword(usuario.getPassword());
        usuarioExistente.setEmail(usuario.getEmail());

        return usuarioExistente;
    }

    @Override
    public void eliminar(int id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }
}
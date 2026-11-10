package com.kodular.jesus.application.service;

import com.kodular.jesus.domain.model.Usuario;
import com.kodular.jesus.domain.ports.UsuarioRepository;
import com.kodular.jesus.domain.ports.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.guardar(usuario);
    }

    @Override
    public Usuario buscarPorId(int id) {
        return usuarioRepository.buscarPorId(id);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.listar();
    }

    @Override
    public Usuario actualizar(int id, Usuario usuario) {
        usuario.setId(id);
        return usuarioRepository.actualizar(usuario);
    }

    @Override
    public void eliminar(int id) {
        usuarioRepository.eliminar(id);
    }
}
package com.kodular.jesus.domain.ports.in;

import com.kodular.jesus.domain.model.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante guardar(Estudiante estudiante);

    Estudiante buscarPorId(int id);

    List<Estudiante> listar();

    Estudiante actualizar(int id, Estudiante estudiante);

    void eliminar(int id);
}
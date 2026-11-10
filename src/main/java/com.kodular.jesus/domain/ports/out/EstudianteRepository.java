package com.kodular.jesus.domain.ports.out;

import com.kodular.jesus.domain.model.Estudiante;

import java.util.List;

public interface EstudianteRepository {

    Estudiante guardar(Estudiante estudiante);

    Estudiante buscarPorId(int id);

    List<Estudiante> listar();

    Estudiante actualizar(Estudiante estudiante);

    void eliminar(int id);
}
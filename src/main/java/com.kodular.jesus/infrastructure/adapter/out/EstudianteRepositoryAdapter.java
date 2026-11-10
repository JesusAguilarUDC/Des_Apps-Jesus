package com.kodular.jesus.infrastructure.adapter.out;

import com.kodular.jesus.domain.model.Estudiante;
import com.kodular.jesus.domain.ports.out.EstudianteRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EstudianteRepositoryAdapter implements EstudianteRepository {

    private final List<Estudiante> estudiantes = new ArrayList<>();

    private int contadorId = 1;

    @Override
    public Estudiante guardar(Estudiante estudiante) {

        estudiante.setId((long) contadorId++);

        estudiantes.add(estudiante);

        return estudiante;
    }

    @Override
    public Estudiante buscarPorId(int id) {

        return estudiantes.stream()
                .filter(estudiante -> estudiante.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Estudiante> listar() {

        return estudiantes;
    }

    @Override
    public Estudiante actualizar(Estudiante estudiante) {

        Estudiante estudianteExistente =
                buscarPorId(estudiante.getId().intValue());

        if (estudianteExistente == null) {
            return null;
        }

        estudianteExistente.setUsuarioId(estudiante.getUsuarioId());
        estudianteExistente.setUsername(estudiante.getUsername());
        estudianteExistente.setPassword(estudiante.getPassword());
        estudianteExistente.setEmail(estudiante.getEmail());
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setFechaNacimiento(estudiante.getFechaNacimiento());
        estudianteExistente.setSemestre(estudiante.getSemestre());
        estudianteExistente.setGenero(estudiante.getGenero());
        estudianteExistente.setTelefono(estudiante.getTelefono());
        estudianteExistente.setPrograma(estudiante.getPrograma());
        estudianteExistente.setUniversidad(estudiante.getUniversidad());

        return estudianteExistente;
    }

    @Override
    public void eliminar(int id) {

        estudiantes.removeIf(
                estudiante -> estudiante.getId() == id
        );
    }
}
package com.kodular.jesus.infrastructure.config;

import com.kodular.jesus.application.service.EstudianteServiceImpl;
import com.kodular.jesus.domain.ports.in.EstudianteService;
import com.kodular.jesus.domain.ports.out.EstudianteRepository;
import com.kodular.jesus.infrastructure.adapter.out.EstudianteRepositoryAdapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EstudianteConfig {

    @Bean
    public EstudianteService estudianteService(
            EstudianteRepository estudianteRepository) {

        return new EstudianteServiceImpl(estudianteRepository);
    }

    @Bean
    public EstudianteRepository estudianteRepository() {
        return new EstudianteRepositoryAdapter();
    }
}
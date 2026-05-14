package com.tuapp.estudiantes.exception;

public class EstudianteNotFoundException extends RuntimeException {
    public EstudianteNotFoundException(Long id) {
        super("No se encontró el estudiante con ID: " + id);
    }
}
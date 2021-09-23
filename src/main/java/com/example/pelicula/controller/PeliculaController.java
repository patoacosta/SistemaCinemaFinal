package com.example.pelicula.controller;

import com.example.horario.HorarioModelo;
import com.example.pelicula.dto.PeliculaDTO;
import com.example.pelicula.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/obtenerPelicula")
    public List<PeliculaDTO> obtenerPelicula(){return peliculaService.listadoPelicula();}

    @PostMapping("/guardarPelicula")
    public PeliculaDTO guardarPelicula(@RequestBody PeliculaDTO datosPelicula){return peliculaService.guardarPelicula(datosPelicula);}

    @PostMapping("/eliminarPelicula")
    public Boolean eliminarPelicula(@RequestBody PeliculaDTO datosNuevos){return peliculaService.eliminarPelicula(datosNuevos);}
}

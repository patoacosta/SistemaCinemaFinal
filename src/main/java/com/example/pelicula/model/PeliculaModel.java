package com.example.pelicula.model;

import com.example.relacion.PeliculaHorarioModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "m_pelicula")

public class PeliculaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Integer id_pelicula;

    @Column(name = "nombre_pelicula")
    private String nombre_pelicula;

    @Column(name = "imagen_pelicula")
    private String imagen_pelicula;

    @Column(name = "duracion_pelicula")
    private Integer duracion_pelicula;

    @Column(name = "clasificacion_pelicula")
    private Character clasificacion_pelicula;

    @Column(name = "status_pelicula")
    private Boolean status_pelicula;

    @OneToMany(mappedBy = "pelicula",fetch = FetchType.LAZY)
    private Set<PeliculaHorarioModel> peliculaHorarioModels;


    public Integer getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Integer id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getImagen_pelicula() {
        return imagen_pelicula;
    }

    public void setImagen_pelicula(String imagen_pelicula) {
        this.imagen_pelicula = imagen_pelicula;
    }

    public Integer getDuracion_pelicula() {
        return duracion_pelicula;
    }

    public void setDuracion_pelicula(Integer duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    public Character getClasificacion_pelicula() {
        return clasificacion_pelicula;
    }

    public void setClasificacion_pelicula(Character clasificacion_pelicula) {
        this.clasificacion_pelicula = clasificacion_pelicula;
    }

    public Boolean getStatus_pelicula() {
        return status_pelicula;
    }

    public void setStatus_pelicula(Boolean status_pelicula) {
        this.status_pelicula = status_pelicula;
    }

    public Set<PeliculaHorarioModel> getPeliculaHorarioModels() {
        return peliculaHorarioModels;
    }

    public void setPeliculaHorarioModels(Set<PeliculaHorarioModel> peliculaHorarioModels) {
        this.peliculaHorarioModels = peliculaHorarioModels;
    }
}

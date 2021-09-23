package com.example.relacion;

import com.example.horario.HorarioModelo;
import com.example.pelicula.model.PeliculaModel;


import javax.persistence.*;

@Entity
@Table(name = "r_pelicula_horario")
public class PeliculaHorarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula_horario")
    private Integer id_pelicula_horario;

    @JoinColumn(name = "id_pelicula")
    @ManyToOne(fetch = FetchType.LAZY)
    private PeliculaModel pelicula;

    @JoinColumn(name = "id_horario")
    @ManyToOne(fetch = FetchType.LAZY)
    private HorarioModelo horarioJoin;



    public Integer getId_pelicula_horario() {
        return id_pelicula_horario;
    }

    public void setId_pelicula_horario(Integer id_pelicula_horario) {
        this.id_pelicula_horario = id_pelicula_horario;
    }

    public PeliculaModel getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaModel pelicula) {
        this.pelicula = pelicula;
    }

    public HorarioModelo getHorarioJoin() {
        return horarioJoin;
    }

    public void setHorarioJoin(HorarioModelo horarioJoin) {
        this.horarioJoin = horarioJoin;
    }

}

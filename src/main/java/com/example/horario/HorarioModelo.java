package com.example.horario;


import com.example.relacion.PeliculaHorarioModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "c_horario")
public class HorarioModelo {

    @Id
    @Column(name = "id_horario")
    private Integer id_horario;

    @OneToMany(mappedBy = "horarioJoin", fetch = FetchType.LAZY)
    private Set<PeliculaHorarioModel> peliculaHorarioSet;



    public Integer getId_horario() {
        return id_horario;
    }

    public void setId_horario(Integer id_horario) {
        this.id_horario = id_horario;
    }

    public Set<PeliculaHorarioModel> getPeliculaHorarioSet() {
        return peliculaHorarioSet;
    }

    public void setPeliculaHorarioSet(Set<PeliculaHorarioModel> peliculaHorarioSet) {
        this.peliculaHorarioSet = peliculaHorarioSet;
    }
}

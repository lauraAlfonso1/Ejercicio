package co.ucentral.Ejemplo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Computadores")
@Table(name= "Computadores")
public class ComputadoresEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CODIGO_REL")
    @SequenceGenerator(name = "SEQ_CODIGO_REL",sequenceName = "SEQ_CODIGO_REL",allocationSize = 1)
    @Column(name = "COM_CODIGO", nullable = false)
    private int Codigo;

    @Column(name = "COM_MARCA", nullable = false)
    private String Nombre;

    @Column(name = "COM_TIPODEDISCO", nullable = false)
    private String TipoDeDisco;

    @Column(name = "COM_COLOR", nullable = false)
    private String Color;

    @Column(name = "COM_PROCESADOR", nullable = false)
    private int Porcesador;





}

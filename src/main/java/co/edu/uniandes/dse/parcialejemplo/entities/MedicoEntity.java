package co.edu.uniandes.dse.parcialejemplo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class MedicoEntity extends BaseEntity{
    private String nombre;
    private String apellido;
    private String especialidad;

}

package laboratorio.ARS.Entidades;
import laboratorio.Paciente.Entidades.Paciente;
import laboratorio.Pruebas.Entidades.Prueba;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "ars")
public class ARS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(name = "nombre_ars", nullable = false, length = 100)
    private String nombreARS;

@Column(name = "RNC",nullable = false, length = 15)
    private int RNC;

@Column(name="represntante", length = 100)
    private String representante;

@Column(name = "direccion", length = 255)
    private String direccion;

@Column(name = "telefono", length = 10)
    private int telefono;

@Column(name = "correo", length = 100)
    private String correo;

@Column(name = "activo")
    private boolean activo;

@OneToMany(mappedBy = "ars", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paciente> pacientes;

@OneToMany(mappedBy = "ars", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prueba> pruebas;

public ARS() {
    }


    public ARS(String nombreARS, int RNC, String representante, String direccion, int telefono, String correo) {
        this.nombreARS = nombreARS;
        this.RNC = RNC;
        this.representante = representante;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.activo = true; // default value
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreARS() {
        return nombreARS;
    }

    public void setNombreARS(String nombreARS) {
        this.nombreARS = nombreARS;
    }

    public int getRNC() {
        return RNC;
    }

    public void setRNC(int RNC) {
        this.RNC = RNC;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }




}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dagss.controladores.prescripcion;

import es.uvigo.esei.dagss.dominio.daos.MedicamentoDAO;
import java.io.Serializable;
import javax.inject.Named;
import es.uvigo.esei.dagss.dominio.daos.PrescripcionDAO;
import es.uvigo.esei.dagss.dominio.daos.RecetaDAO;
import es.uvigo.esei.dagss.dominio.entidades.Cita;
import es.uvigo.esei.dagss.dominio.entidades.EstadoReceta;
import es.uvigo.esei.dagss.dominio.entidades.Medicamento;
import es.uvigo.esei.dagss.dominio.entidades.Paciente;
import es.uvigo.esei.dagss.dominio.entidades.Prescripcion;
import es.uvigo.esei.dagss.dominio.entidades.Receta;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;


@Named(value="prescripcionControlador")
@SessionScoped
public class PrescripcionControlador implements Serializable{
    private String tipoBusqueda;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Medicamento> listaMedicamentos;
    private String indicaciones;
    private int dosis;
    
    private Medicamento medicamentoSeleccionado;
    
    private long editable=0;
    
    private Prescripcion prescripcion=new Prescripcion();
    @EJB
    PrescripcionDAO prescripcionDAO; 
    
    @EJB 
    RecetaDAO recetaDAO;
    
    @EJB 
    MedicamentoDAO medicamentoDAO;
    
    public PrescripcionControlador(){
    }

    /**
     *
     * @param citaActual
     */
    public void doPrescripcionNueva(Cita citaActual) throws Exception{
        Prescripcion prescripcion = new Prescripcion();
        
        prescripcion.setPaciente(citaActual.getPaciente());
        prescripcion.setMedicamento(this.medicamentoSeleccionado);
        prescripcion.setMedico(citaActual.getMedico());
        prescripcion.setDosis(this.dosis);
        prescripcion.setIndicaciones(this.indicaciones);
        prescripcion.setFechaInicio(this.fechaInicio);
        prescripcion.setFechaFin(this.fechaFin);
        
        LocalDate begin = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate end = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Period time = Period.between(begin, end);
        
        int numRecetas=(time.getDays()*this.dosis) / this.medicamentoSeleccionado.getNumeroDosis();
        
        if(numRecetas==0){
            numRecetas=1;
        }
        
        prescripcionDAO.crear(prescripcion);
        for(int i=0;i<numRecetas;i++){
            recetaDAO.crear(new Receta(prescripcion,this.medicamentoSeleccionado.getNumeroDosis() ,this.fechaInicio, this.fechaFin, EstadoReceta.GENERADA));
        }
        unsetMedicamento();
    }
    
   public void doModifyPrescription(Prescripcion prescripcionO) throws Exception{
       if(editable==0){
           editable=prescripcionO.getId();
           this.prescripcion = prescripcionO;
       }else{
           prescripcionDAO.actualizar(this.prescripcion);
           editable=0;
       }
   } 
    
   public Prescripcion getUltimaPrescripcion(long id) {
       return prescripcionDAO.buscarUltimaPrescripcionPorID( id);
       
   }

   public List<Prescripcion> getPrescripcionesPaciente(Paciente paciente){
       return prescripcionDAO.getPrescripcionesPaciente(paciente.getId());
   }
   
   public void eliminarPrescripcion(Prescripcion prescripcion){
       prescripcionDAO.eliminar(prescripcion);
   }
   
   public String getTipoBusqueda() {
        return tipoBusqueda;
   }

   public void setTipoBusqueda(String tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
   }
   
   public void buscarMedicamentos(String busqueda) throws Exception{
       
       switch(this.tipoBusqueda){
           case "Nombre":
               this.listaMedicamentos = getMedicamentosPorNombre(busqueda);
               break;
           case "Principio":
               this.listaMedicamentos = getMedicamentosPorPrincipio(busqueda);
               break;    
           case "Fabricante":
               this.listaMedicamentos = getMedicamentosPorFabricante(busqueda);    
               break;  
           case "Familia":
               this.listaMedicamentos = getMedicamentosPorFamilia(busqueda);    
               break;  
       }
   }
   
   public List<Medicamento> getMedicamentosPorNombre(String nombre){
       return medicamentoDAO.buscarPorNombre(nombre);
   }
   
   public List<Medicamento> getMedicamentosPorPrincipio(String nombre){
       return medicamentoDAO.buscarPorPrincipioActivo(nombre);
   }
   
   public List<Medicamento> getMedicamentosPorFabricante(String nombre){
       return medicamentoDAO.buscarPorFabricante(nombre);
   }
   
   public List<Medicamento> getMedicamentosPorFamilia(String nombre){
       return medicamentoDAO.buscarPorFamilia(nombre);
   }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setListaMedicamentos(List<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public void setMedicamento(Medicamento medicamentoSeleccionado) {
        this.medicamentoSeleccionado = medicamentoSeleccionado;
    }

   public void unsetMedicamento(){
       this.medicamentoSeleccionado = null;
   }

    public Medicamento getMedicamentoSeleccionado() {
        return medicamentoSeleccionado;
    }

    public void setMedicamentoSeleccionado(Medicamento medicamentoSeleccionado) {
        this.medicamentoSeleccionado = medicamentoSeleccionado;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public long getEditable() {
        return editable;
    }

    public void setEditable(long editable) {
        this.editable = editable;
    }

    public Prescripcion getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(Prescripcion prescripcion) {
        this.prescripcion = prescripcion;
    }
    
}

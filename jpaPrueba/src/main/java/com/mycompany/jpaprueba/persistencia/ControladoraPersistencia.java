package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;

public class ControladoraPersistencia {

    //este se va a encargar de controlar cada una de las instancias de la JPA CONTROLLERS QUE TENGAMOS
    AlumnoJpaController aluJpa = new AlumnoJpaController(); //instanciamos el jpa controller (tenemos que instanciar todos los que tengamos, en este caso solo tenemos 1)
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();

    //ALUMNO
    public void crearAlumno(Alumno alu) {
        //recibimos el dato y lo enviamos a la jpacontroller especifica de alumno
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //para traer un dato de la BD
    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id); //nos devuelve el alumno que encuentre en la BD, si no encuentra nada nos devuelve un NULL
    }

    //nos trae la lista completa
    public ArrayList<Alumno> traerListaAlumno() {
        List<Alumno> listita = aluJpa.findAlumnoEntities(); //creamos una lista para recibir los datos
        //convertimos la lista en un arraylist
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        return listaAlumnos;
    }

    //CARRERA
    public void crearAlumno(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarrera() {
        List<Carrera> lista =  carreJpa.findCarreraEntities();
        ArrayList<Carrera>listaCarreras = new ArrayList<Carrera>(lista);
        return listaCarreras;
    }

    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias() {
        List<Materia>lista=mateJpa.findMateriaEntities();
        LinkedList<Materia>listaMaterias = new LinkedList(lista);
        return listaMaterias;        
    }

     

}

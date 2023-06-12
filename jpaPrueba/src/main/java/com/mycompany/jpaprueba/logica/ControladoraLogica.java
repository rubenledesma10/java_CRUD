
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;


//aca van a estar todos los meotodos que vamos a necesitar para hacer el CRUD, se va encargar de traer los metodos que tengo en la controladora que tienen los metodos
//este recibe los datos, ya sea de la interfaz grafica o lo que sea
public class ControladoraLogica {
    
    //para acceder a los metodos que tiene la conrtoladora de persistencia, de aca me voy a la controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //PARA HACER EL CRUD DE ALUMNOS
    //crear un metodo para dar de alta 
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno (int id){
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){ //es alumno porque no es un procedimiento, es una funcion, tiene que devolvernos un valor de la BD
        return controlPersis.traerAlumno(id);
    }
    
    //para traer todos los datos de una BD
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumno();
    }
    
    //PARA HACER EL CRUD DE LAS CARRERAS
    
    //crear un metodo para dar de alta 
    public void crearCarrera(Carrera carre){
        controlPersis.crearAlumno(carre);
    }
    
    public void eliminarCarrera (int id){
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    
    public Carrera traerCarrera(int id){ //es alumno porque no es un procedimiento, es una funcion, tiene que devolvernos un valor de la BD
        return controlPersis.traerCarrera(id);
    }
    
    //para traer todos los datos de una BD
    public ArrayList<Carrera> traerListaCarrera(){
        return controlPersis.traerListaCarrera();
    }
    
    //PARA HACER EL CRUD DE LAS MATERIAS
    //crear un metodo para dar de alta 
    public void crearMateria(Materia mate){
        controlPersis.crearMateria(mate);
    }
    
    public void eliminarMateria (int id){
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    
    public Materia traerMateria(int id){ //es alumno porque no es un procedimiento, es una funcion, tiene que devolvernos un valor de la BD
        return controlPersis.traerMateria(id);
    }
    
    //para traer todos los datos de una BD
    public LinkedList<Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
    

}

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JpaPrueba {

    public static void main(String[] args) {

        /*ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        ControladoraLogica control = new ControladoraLogica();

        Alumno alu = new Alumno(5, "Ruben", "Ledesma", new Date()); //pasamos los datos del alumno, mayormente estos datos se reciben del lado del frontend
        
        control.crearAlumno(alu); //llamamos el metodo para crear alumno
        
        *para eliminar
        control.eliminarAlumno(15);*
        
        //para editar
        alu.setApellido("Ezequiel"); //edito algo del objeto 
        control.editarAlumno(alu); //con esto lo mando a la logica para que se lo mande a la persistencia (para que se hagan los cambios en la BD)
         
        //para traer un alumno en particular
        System.out.println("--------BUSQUEDA INDIVIDUAL----------");
        Alumno alu = control.traerAlumno(10);
        System.out.println("El alumno es " + alu.toString());
         //para traer todos los alumnos
        System.out.println("--------BUSQUEDA COLECTIVA----------");
        ArrayList<Alumno>listaAlumnos = control.traerListaAlumnos();
        for(Alumno al:listaAlumnos){
            System.out.println("El alumno es " +al.toString());
        }*/
        ControladoraLogica control = new ControladoraLogica();
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>(); //CREAMOS LISTA DE MATERIAS VACIA
        Carrera carre = new Carrera(1, "Futbolista", listaMaterias); //CREACION CARRERA Y ASOCIAMOS CARRERA CON LISTA DE MATERIAS
        control.crearCarrera(carre);  //GUARDAR CARRERA BD PORQUE LAS MATERIAS NECESITAN UNA CARRERA PARA SER GUARDADAS
        //CREACION MATERIAS

        Materia mate1 = new Materia(1, "Tiros Libres", "Anual", carre); //aca la carrera se va a asociar con materias pero vacio, no va a tener nada, asocia las ID
        Materia mate2 = new Materia(2, "Penales", "Cuatrimestral", carre);
        Materia mate3 = new Materia(3, "Contra golpe", "Anual", carre);

        //GUARDAMOS MATERIA BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        // AGREGAMOS LAS MATERIAS A LA LISTA
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias); //le agregamos la lista de materias a nivel logico
        control.editarCarrera(carre); //este carre es nuevo, se lo pasamos del setlistamaterias, cuando hagamos esta edicion se va a llenar la lista
        
        
        //CREACION ALUMNO
        Alumno alu = new Alumno(10, "Lionel", "Messi", new Date(), carre);

        //GUARDAMOS ALUMNO BD
        control.crearAlumno(alu);

        //vemos resultado
        Alumno al = control.traerAlumno(10); //traemos el alumno
        System.out.println("El alumno es " + al.getNombre() + " " + al.getApellido() + " y es " + al.getCarre().getNombre());

    }
}

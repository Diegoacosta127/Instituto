package instituto;
/**
 *
 * @author @diegoacosta127
 */
public class Instituto {
    public static void main(String[] args) {
        
    	/*Instancias*/
    	
    	Libro[] libros = new Libro [3];
        libros[0] = new Libro("Fisica es una materia de %$#/&", "Física");
        libros[1] = new Libro("Cómo forrarse en guita a puro divague", "Filosofía");
        libros[2] = new Libro ("Matemáticas para gente como uno", "Matemáticas");
        Libro librito = new Libro();
        
        Profesor[] profes = new Profesor[3];
        profes[0] = new Profesor("Adolfo Cambiaso", "Física", 32);
        profes[1] = new Profesor("David Stirling", "Matemáticas", 36);
        profes[2] = new Profesor("Pablo MacDonough", "Filosofía", 24);
        
        Estudiante[] alumno1 = new Estudiante[3];
        alumno1[0] = new Estudiante("Diego", 30, 'm');
        alumno1[0].dameMaterias();
        alumno1[0].dameAsistencias(23, 31, 27);
        alumno1[0].dameNotas(8, 7, 9);
        alumno1[1] = new Estudiante("Luciana", 23, 'f');
        alumno1[1].dameMaterias();
        alumno1[1].dameAsistencias(25, 33, 30);
        alumno1[1].dameNotas(9, 10, 10);
        alumno1[2] = new Estudiante("Martín", 27, 'm');
        alumno1[2].dameMaterias();
        alumno1[2].dameAsistencias(15, 20, 17);
        alumno1[2].dameNotas(6, 4, 5);
        
        Estudiante[] alumno2 = new Estudiante [3];
        alumno2[0] = new Estudiante("Mariel", 19, 'f');
        alumno2[0].dameMaterias();
        alumno2[0].dameAsistencias(23, 31, 27);
        alumno2[0].dameNotas(8, 7, 9);
        alumno2[1] = new Estudiante("Valeria", 25, 'f');
        alumno2[1].dameMaterias();
        alumno2[1].dameAsistencias(25, 33, 30);
        alumno2[1].dameNotas(9, 10, 10);
        alumno2[2] = new Estudiante("Marcos", 30, 'm');
        alumno2[2].dameMaterias();
        alumno2[2].dameAsistencias(15, 20, 17);
        alumno2[2].dameNotas(6, 4, 5);
        
        Estudiante[] alumno3 = new Estudiante [3];
        alumno3[0] = new Estudiante("Mariel", 19, 'f');
        alumno3[0].dameMaterias();
        alumno3[0].dameAsistencias(23, 31, 27);
        alumno3[0].dameNotas(8, 7, 9);
        alumno3[1] = new Estudiante("Luciana", 23, 'f');
        alumno3[1].dameMaterias();
        alumno3[1].dameAsistencias(25, 33, 30);
        alumno3[1].dameNotas(9, 10, 10);
        alumno3[2] = new Estudiante("Martín", 27, 'm');
        alumno3[2].dameMaterias();
        alumno3[2].dameAsistencias(15, 20, 17);
        alumno3[2].dameNotas(6, 4, 5);
        
        Aula[] aulas = new Aula[3];
        aulas[0] = new Aula(1, 2, alumno1, "Física", 40 );
        aulas[1] = new Aula(2, 3, alumno2, "Filosofía", 40);
        aulas[2] = new Aula(3, 4, alumno3, "Matemáticas", 40);
        
        /*Funciones*/

        for(int i=0; i<aulas.length; i++){//recorre las aulas
            for (int j=0; j<profes.length; j++){//recorre los profesores
                if(aulas[i].materia==profes[j].materia && profes[j].ControlFaltas(profes[j].asistencias, 20, aulas[i].totalClases) && aulas[i].minimoAlumnos()){//condiciones para abrir aula
                    System.out.println("El aula " +aulas[i].ID+ " puede abrir la materia "+aulas[i].materia + " con el profesor "+profes[j].nombre);
                    int aprobadosM = 0;
                    int aprobadosF = 0;
                    for (int k=0; k<aulas[i].estudiante.length;k++) {//recorre estudiantes del aula
                    	if (aulas[i].estudiante[k].getSexo()=='f' || aulas[i].estudiante[k].getSexo()=='F')
                    		aprobadosF = aulas[i].estudiante[k].alumnoAprobado(aulas[i].getMateria(), aprobadosF);
                    	if (aulas[i].estudiante[k].getSexo()=='m' || aulas[i].estudiante[k].getSexo()=='M')
                    		aprobadosM = aulas[i].estudiante[k].alumnoAprobado(aulas[i].getMateria(), aprobadosM);
                    }//fin recorre estudiantes del aula
                    for(int m=0; m<libros.length; m++) {//recorro vector de libros
                    	if (libros[m].materia==aulas[i].materia)//matcheo materia de libro y aula
                    		librito = libros[m];
                    }//fin recorro vector de libros
                    System.out.println("El aula " + aulas[i].ID + " tiene " + aprobadosM + " alumnos masculinos aprobados.");
                    System.out.println("El aula " + aulas[i].ID + " tiene " + aprobadosF + " alumnas femeninas aprobadas.");
                    System.out.println("Bibliografía oficial de la materia " + aulas[i].materia + ": \"" + librito.getTitulo() + "\"");
                }//fin condiciones para abrir aula
                else{
                    System.out.println("El aula " +aulas[i].ID+ " no puede abrir "+aulas[i].materia + " con el profesor "+profes[j].nombre);
                }
            }//fin recorre los profesores
        }//fin recorre las aulas
    }//fin main
}
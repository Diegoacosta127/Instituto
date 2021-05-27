package instituto;
/**
 * @author @diegoacosta127
 */
public class Aula {
    public int ID;
    public int maxEstudiantes;
    public Estudiante[] estudiante;
    public String materia;
    public int totalClases;
    
    Aula(){
        
    }
    
    Aula(int ID, int maxEstudiantes, Estudiante[] alumno, String materia, int totalClases){
        this.ID = ID;
        this.maxEstudiantes = maxEstudiantes;
        this.estudiante = alumno;
        this.materia = materia;
        this.totalClases = totalClases;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public boolean minimoAlumnos () {//evalua todos los alumnos no libres
    	
        int a = 0;
        
        for (int i = 0; i<this.estudiante.length; i++){//recorro lista estudiantes
            for(int j = 0; j<this.estudiante[i].materia.length; j++){//recorro materias y asistencias
                if (this.estudiante[i].materia[j].equals(this.materia) && this.estudiante[i].asistencias[j]>(this.totalClases)/2){
                    a++;
                }
            }
        }
        
        if (a > (this.maxEstudiantes)/2)
    		return true;
    	else
    		return false;
    }
    
}
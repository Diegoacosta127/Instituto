package instituto;
/**
 * @author @diegoacosta127
 */
public class Profesor extends Persona {
    
    public String materia;
    public int asistencias;
    
    Profesor(String nombre, int edad, char sexo){
        super(nombre, edad, sexo);
    }
    
    Profesor(String nombre, int edad, char sexo, String materia, int asistencias){
        super(nombre, edad, sexo);
        super.nombre = nombre;
        super.edad = edad;
        super.sexo = sexo;
        this.materia = materia;
        this.asistencias = asistencias;
    }
    
    Profesor (String nombre, String materia, int asistencias){
        super(nombre);
        super.nombre = nombre;
        this.materia = materia;
        this.asistencias = asistencias;
    }

    public String getMateria() {
            return materia;
    }

    public void setMateria(String materia) {
            this.materia = materia;
    }

    public int getAsistencias() {
            return asistencias;
    }

    public void setAsistencias(int asistencias) {
            this.asistencias = asistencias;
    }
    
   
    public boolean ControlFaltas(int asistencias, int limite, int total){
    	//devuelve true si no excede el limite de faltas
        if (asistencias>limite*total/100)
            return true;
        else
            return false;
    }
}
package instituto;

/**
 * @author @diegoacosta127
 */
public class Estudiante extends Persona {
    public String[] materia = new String [3];
    public int[] nota = new int [3];
    public int [] asistencias = new int [3];
    
    Estudiante(String nombre, int edad, char sexo){
        super(nombre, edad, sexo);
    }
    
    Estudiante(String nombre, int edad, char sexo, String[] materia, int[] nota, int[] asistencias){
        super(nombre, edad, sexo);
        super.nombre = nombre;
        super.edad = edad;
        super.sexo = sexo;
        this.materia = materia;
        this.nota = nota;
        this.asistencias = asistencias;
    }

    public String[] getMateria() {
        return materia;
    }

    public void setMateria(String[] materia) {
        this.materia = materia;
    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }

    public int[] getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int[] asistencias) {
        this.asistencias = asistencias;
    }
    
    public void dameMaterias(){
        this.materia[0]="Matemáticas";
        this.materia[1]="Física";
        this.materia[2]="Filosofía";
    }
    
    public void dameNotas(int a, int b, int c){
        this.nota[0]=a;
        this.nota[1]=b;
        this.nota[2]=c;
    }
    
    public void dameAsistencias(int a, int b, int c){
        this.asistencias[0]=a;
        this.asistencias[1]=b;
        this.asistencias[2]=c;
    }
    
    public int alumnoAprobado (String unaMateria, int a){
        for (int i=0; i<this.materia.length; i++){
        		if (this.nota[i]>=6 && this.materia[i]==unaMateria)
        			a++;
    	}
        return a;
    }
    
    
}
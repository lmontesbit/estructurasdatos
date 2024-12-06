package actividad3;

public class Departamento {
    String nombre;
    int numMunicipios;
    double extension;
    int numHabitantes;
    double temperatura;
    int indicativoTelefonico;
       
    public Departamento(String nombre, int numMunicipios, double extension, int numHabitantes, double temperatura,
            int indicativoTelefonico) {
        this.nombre = nombre;
        this.numMunicipios = numMunicipios;
        this.extension = extension;
        this.numHabitantes = numHabitantes;
        this.temperatura = temperatura;
        this.indicativoTelefonico = indicativoTelefonico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumMunicipios() {
        return numMunicipios;
    }
    public void setNumMunicipios(int numMunicipios) {
        this.numMunicipios = numMunicipios;
    }
    public double getExtension() {
        return extension;
    }
    public void setExtension(double extension) {
        this.extension = extension;
    }
    public int getNumHabitantes() {
        return numHabitantes;
    }
    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public int getIndicativoTelefonico() {
        return indicativoTelefonico;
    }
    public void setIndicativoTelefonico(int indicativoTelefonico) {
        this.indicativoTelefonico = indicativoTelefonico;
    }

    @Override
    public String toString() {
        return "Departamento [nombre=" + nombre + ", numMunicipios=" + numMunicipios + ", extension=" + extension
                + ", numHabitantes=" + numHabitantes + ", temperatura=" + temperatura + ", indicativoTelefonico="
                + indicativoTelefonico + "]";
    }

}
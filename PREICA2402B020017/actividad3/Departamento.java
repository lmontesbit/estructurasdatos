package actividad3;

public class Departamento {
    String nombre;
    int numMunicpios;
    double extension;
    int numHabitantes;
    double temperatura;
    int indicativoTelefonico;

    public Departamento(String nombre, int numMunicpios, double extension, int numHabitantes, double temperatura,
            int indicativoTelefonico) {
        this.nombre = nombre;
        this.numMunicpios = numMunicpios;
        this.extension = extension;
        this.numHabitantes = numHabitantes;
        this.temperatura = temperatura;
        this.indicativoTelefonico = indicativoTelefonico;
    }

    @Override
    public String toString() {
        return "Departamento [nombre=" + nombre + ", numMunicpios=" + numMunicpios + ", extension=" + extension
                + ", numHabitantes=" + numHabitantes + ", temperatura=" + temperatura + ", indicativoTelefonico="
                + indicativoTelefonico + "]";
    }

}

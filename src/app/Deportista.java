package app;

public class Deportista extends Persona {
    public String Deporte;
    public int nroDeportivo;
    public double altura;
    public double peso;
}

public void participar(Olimpiada olimpiada) {
olimpiada.participantes.add(this);
 }
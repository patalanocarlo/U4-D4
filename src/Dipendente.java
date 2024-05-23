public abstract class Dipendente implements Check {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    // Costruttore
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo astratto per calcolare lo stipendio
    public abstract double calcolaStipendio();

    @Override
    public void checkIn(){
        System.out.println("Il dipendente con la matricola:" + matricola + "ha iniziato il suo turno ");
    }
}







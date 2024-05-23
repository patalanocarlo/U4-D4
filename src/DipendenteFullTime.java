public class DipendenteFullTime extends Dipendente {
    private int oreLavorate;
    private double pagaOraria;
    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, int oreLavorate , double pagaOraria) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate=oreLavorate;
        this.pagaOraria=pagaOraria;
    }

    @Override
    public double calcolaStipendio() {
        return oreLavorate * pagaOraria;
    }
}
public class Dirigente extends  Dipendente{
    private double guadagnoMaggiorato;
    public Dirigente (String matricola, double stipendio, Dipartimento dipartimento, double guadagnoMaggiorato){
        super(matricola , stipendio , dipartimento);
        this.guadagnoMaggiorato= guadagnoMaggiorato;
    }
    public double calcolaStipendio(){
        return getStipendio() + guadagnoMaggiorato;
    }

}

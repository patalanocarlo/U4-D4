public class DipendentePartTime extends  Dipendente{
    private int oreLavorate;
    private double pagaOraria;
    public  DipendentePartTime( String matricola ,  double stipendio, Dipartimento dipartimento, int oreLavorate , double pagaOraria){
super(matricola ,stipendio ,dipartimento);
this.oreLavorate=oreLavorate;
this.pagaOraria=pagaOraria;
    }

    public double calcolaStipendio(){
        return oreLavorate * pagaOraria;
    }
}

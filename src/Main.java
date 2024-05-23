public class Main {
    public static void main(String[] args) {
        // Creazione delle diverse istanze di dipendenti
        Dipendente dp1 = new DipendenteFullTime("2123", 0, Dipartimento.Produzione, 60, 47.2 );
        Dipendente dp2 = new DipendentePartTime("2356", 0, Dipartimento.Amministrazione, 40, 35.0);
        Dipendente dp3 = new Dirigente("1235", 5000.00, Dipartimento.Vendite, 1500.00);

        // Creo i volontari:

        Volontario v1= new Volontario("Carlo" , 21 ,"CV1", "16.00");

        Volontario v2= new Volontario("Antonio" , 31 ,"CV2", "20.00");
        // Creazione dell'array di dipendenti
        Dipendente[] dipendenti = {dp1, dp2, dp3};

         Check[] persone= {dp1,dp2,dp3,v1,v2};

         for (Check persona : persone){

             persona.checkIn();
}

        // Iterazione sull'array e calcolo degli stipendi totali
        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.calcolaStipendio());
        }
    }
}
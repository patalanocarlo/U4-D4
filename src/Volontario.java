public class Volontario implements Check {
    private String nome;
    private int età;
    private String CV;
    private String Orario;
    public Volontario( String nome, int età, String CV , String Orario){
        this.nome=nome;
        this.età=età;
        this.CV=CV;
        this.Orario=Orario;
    }

public void checkIn(){
    System.out.println("Il volontario :" + " " + nome + " " + "ha iniziato il suo turno alle ore:" + " " + Orario);
}
    }


public class Prenotazione {
    private String cliente;
    private int data;
    private int postiRichiesti;
    boolean validaPrenotazione;
    int postiDisponibili;
    

    public Prenotazione(String cliente,String data, int postiRichiesti) {
        this.cliente = cliente;
        this.data = data;
        this.postiRichiesti = postiRichiesti;

    }

    //metodo get
    public String getCliente() 
    { return cliente; }
    
    public String getData() 
    { return data; }

    public int getpostiRichiesti()
     { return postiRichiesti; }

     //metodo set
     public void setCliente(String nuovoCliente){
        this.cliente = nuovoCliente;
     }
    public void setData(int nuovaData){
        this.data = nuovaData;
    }
    public void setPostiRichiesti(int nuovoPosto){
        this.postiRichiesti = nuovoPosto;
    }

    public void stampaDettagli() {
        System.out.println("Cliente" + cliente + "Data" + data + "postiRichiesti" + postiRichiesti);
    }
     public void validaPrenotazione() {
        if(validaPrenotazione == true) {
            System.out.println("Prenotazione valida");
        } else {
            System.out.println("Prenotazione non valida");
        }
    }
}
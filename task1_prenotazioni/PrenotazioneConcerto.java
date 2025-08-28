public class PrenotazioneConcerto extends Prenotazione {
    String concerto;
    public PrenotazioneConcerto(String cliente, String data, int postiRichiesti,String concerto) {
        super(cliente,data,postiRichiesti);
        this.concerto = concerto;
        
    }
    @Override
    public boolean validaPrenotazione (int postiDisponibili) {
        if (getpostiRichiesti <= getpostiDisponibili && postiDisponibili <5) {
            return true;
            else {
                System.out.println("prenotazione non valida!")
            }
            
        }
    }

}
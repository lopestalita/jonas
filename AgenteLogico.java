public class AgenteLogico {

    public boolean decidirSairDeCasa(String clima) {
      
        if (clima.equals("ensolarado")) {
            System.out.println("O clima está ensolarado. Você deve sair de casa!");
            return true;
        }
       
        else if (clima.equals("chuvoso")) {
            System.out.println("Está chovendo. Melhor ficar em casa.");
            return false;
        }
        
        else {
            System.out.println("O clima está indefinido. Você decide se quer sair ou não.");
            return false;
        }
    }

    public static void main(String[] args) {
        AgenteLogico agente = new AgenteLogico();

        String clima1 = "ensolarado";
        String clima2 = "chuvoso";
        String clima3 = "nublado";

        agente.decidirSairDeCasa(clima1);
        agente.decidirSairDeCasa(clima2);
        agente.decidirSairDeCasa(clima3);
    }
}

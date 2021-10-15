import ws.BanqueService;
import ws.BanqueServiceService;
import ws.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        double converted = stub.convertionEuroToMad(120);
        System.out.println(converted);
        System.out.println("***************************************");
        Compte compte = stub.getAccount(25L);
        System.out.println("Code : " + compte.getCode() +" Solde : " + compte.getSolde());
        List<Compte> comptes = stub.getAllAccounts();
        comptes.forEach(cpte -> {
            System.out.println("code " + cpte.getCode() + "solde " + cpte.getSolde());
        });
    }
}

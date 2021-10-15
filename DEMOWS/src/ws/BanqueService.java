package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    @WebMethod(operationName = "convertionEuroToMad")
    public double converstion(@WebParam(name="amount") double amount){
        return amount*10.50;
    }

    @WebMethod
    public Compte getAccount(@WebParam(name = "code") Long code){
        return  new Compte(code, Math.random()*9000, new Date());
    }

    @WebMethod
    public List<Compte> getAllAccounts(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1L, 5000, new Date()));
        comptes.add(new Compte(2L, 7000, new Date()));
        comptes.add(new Compte(3L,15000, new Date()));
        return comptes;
    }


}

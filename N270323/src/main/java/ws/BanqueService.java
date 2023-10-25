package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.WebParam;

import java.util.Date;
import java.util.List;
@WebService(serviceName="BanqueWS")    // POJO : Plain Old Java Object
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) { return new Compte(code, Math.random() * 98346, new Date()); }
    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, Math.random() * 98346, new Date()),
                new Compte(2, Math.random() * 47342, new Date()),
                new Compte(3, Math.random() * 51893, new Date()),
                new Compte(4, Math.random() * 12998, new Date()),
                new Compte(5, Math.random() * 29453, new Date()),
                new Compte(6, Math.random() * 73409, new Date()),
                new Compte(7, Math.random() * 39026, new Date())
        );
    }
}

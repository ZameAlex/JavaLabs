package Services;

import Models.Questionare;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface OuestionareService {
    @WebMethod
    public void Add(String name, int User);
    @WebMethod
    public void Delete(int id);
    @WebMethod
    public ArrayList<Questionare> Select();
    @WebMethod
    public void Update(String name, int user, int id);
}

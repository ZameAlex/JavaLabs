package Services;

import Models.Answer;
import Models.Role;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RoleService {
    @WebMethod
    public void Add(String name);
    @WebMethod
    public void Delete(int id);
    @WebMethod
    public ArrayList<Role> Select();
    @WebMethod
    public void Update(String name, int id);
}

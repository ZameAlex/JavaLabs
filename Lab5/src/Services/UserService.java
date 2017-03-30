package Services;

import Models.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {

    @WebMethod
    public void Add(String login, String pass,int Role);
    @WebMethod
    public void Delete(int id);
    @WebMethod
    public ArrayList<User> Select();
    @WebMethod
    public void Update(String login, String pass,int role, int id);
}

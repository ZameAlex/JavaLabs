package Services;

import Controllers.UserController;
import Models.User;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by Алексей on 29.03.2017.
 */
@WebService(endpointInterface = "Services.UserService")
public class UserServiceImpl implements UserService {
    @Override
    public ArrayList<User> Select() {
        UserController controller = new UserController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        return (ArrayList<User>)controller.Select();

    }

    @Override
    public void Add(String login, String pass,int Role) {
        UserController controller = new UserController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Create(login,pass,Role);
    }

    @Override
    public void Delete(int id) {
        UserController controller = new UserController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Delete(id);
    }

    @Override
    public void Update(String login,String pass,int role,int id) {
        UserController controller = new UserController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Update(login, pass,role, id);
    }
}

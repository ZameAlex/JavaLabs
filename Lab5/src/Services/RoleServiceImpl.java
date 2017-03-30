package Services;

import Controllers.RoleController;
import Models.Role;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by Алексей on 29.03.2017.
 */
@WebService(endpointInterface = "Services.RoleService")
public class RoleServiceImpl implements RoleService {
    @Override
    public ArrayList<Role> Select() {
        RoleController controller = new RoleController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        return (ArrayList<Role>)controller.Select();

    }

    @Override
    public void Add(String text) {
        RoleController controller = new RoleController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Create(text);
    }

    @Override
    public void Delete(int id) {
        RoleController controller = new RoleController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Delete(id);
    }

    @Override
    public void Update(String name,int id) {
        RoleController controller = new RoleController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Update(name,  id);
    }
}

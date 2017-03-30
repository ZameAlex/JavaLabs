package Services;

import Controllers.QuestionareController;
import Models.Questionare;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by Алексей on 29.03.2017.
 */
@WebService(endpointInterface = "Services.OuestionareService")
public class QuestionareServiceImpl implements OuestionareService {
    @Override
    public ArrayList<Questionare> Select() {
        QuestionareController controller = new QuestionareController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        return (ArrayList<Questionare>)controller.Select();

    }

    @Override
    public void Add(String name,int user) {
        QuestionareController controller = new QuestionareController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Create(name,user);
    }

    @Override
    public void Delete(int id) {
        QuestionareController controller = new QuestionareController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Delete(id);
    }

    @Override
    public void Update(String name,int user,int id) {
        QuestionareController controller = new QuestionareController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Update(name, user, id);
    }
}

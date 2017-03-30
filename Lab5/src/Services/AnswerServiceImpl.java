package Services;
import Models.Answer;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import Controllers.AnswerController;

/**
 * Created by Алексей on 29.03.2017.
 */
@WebService(endpointInterface = "Services.AnswerService")
public class AnswerServiceImpl implements AnswerService {
    @Override
    public ArrayList<Answer> Select() {
        AnswerController controller = new AnswerController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        return (ArrayList<Answer>)controller.Select();

    }

    @Override
    public void Add(String text,int Quest) {
        AnswerController controller = new AnswerController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Create(text,Quest);
    }

    @Override
    public void Delete(int id) {
        AnswerController controller = new AnswerController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Delete(id);
    }

    @Override
    public void Update(String text,int Quest,int id) {
        AnswerController controller = new AnswerController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Update(text, Quest, id);
    }
}

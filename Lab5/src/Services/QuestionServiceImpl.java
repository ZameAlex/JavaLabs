package Services;

import Controllers.QuestionController;
import Models.Question;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by Алексей on 29.03.2017.
 */
@WebService(endpointInterface = "Services.QuestionService")
public class QuestionServiceImpl implements QuestionService {
    @Override
    public ArrayList<Question> Select() {
        QuestionController controller = new QuestionController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        return (ArrayList<Question>)controller.Select();

    }

    @Override
    public void Add(String text,int Quest) {
        QuestionController controller = new QuestionController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Create(text,Quest);
    }

    @Override
    public void Delete(int id) {
        QuestionController controller = new QuestionController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Delete(id);
    }

    @Override
    public void Update(String text,int Quest,int id) {
        QuestionController controller = new QuestionController();
        controller.setCon(jdbcconnection.JDBCConnection.getConn());
        controller.Update(text, Quest, id);
    }
}

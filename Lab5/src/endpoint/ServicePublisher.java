package endpoint;

/**
 * Created by Алексей on 29.03.2017.
 */
import javax.xml.ws.Endpoint;
import Services.AnswerServiceImpl;
import Services.QuestionServiceImpl;
import Services.QuestionareServiceImpl;
import Services.UserServiceImpl;
import Services.RoleServiceImpl;
public class ServicePublisher {

    public static void main(String... args) {
        Endpoint.publish("http://localhost:1986/answer", new AnswerServiceImpl());
        Endpoint.publish("http://localhost:1986/question", new QuestionServiceImpl());
        Endpoint.publish("http://localhost:1986/questionare", new QuestionareServiceImpl());
        Endpoint.publish("http://localhost:1986/user", new UserServiceImpl());
        Endpoint.publish("http://localhost:1986/role", new RoleServiceImpl());

    }
}

package Services;

import Models.Answer;
import Models.Question;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface QuestionService {
    @WebMethod
    public void Add(String text, int Quest);
    @WebMethod
    public void Delete(int id);
    @WebMethod
    public ArrayList<Question> Select();
    @WebMethod
    public void Update(String text, int Quest, int id);
}

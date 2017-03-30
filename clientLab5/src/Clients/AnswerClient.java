package Clients;

/**
 * Created by Алексей on 30.03.2017.
 */
import services.AnswerClasses.*;

public class AnswerClient {

    public static void main(String[] args) {
        // подключаемся к тегу service в wsdl описании
        AnswerServiceImplService helloService = new AnswerServiceImplService();
        // получив информацию из тега service подключаемся к самому веб-сервису
        AnswerService hello = helloService.getAnswerServiceImplPort();

        // обращаемся к веб-сервису и выводим результат в консоль
        hello.add("ans",1);
    }
}

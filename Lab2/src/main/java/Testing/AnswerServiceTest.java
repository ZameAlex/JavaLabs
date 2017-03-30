/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import crud.AnswerService;
import  Models.Answer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Алексей
 */
public class AnswerServiceTest {
    AnswerService service = new AnswerService();
    
    @Test
    public void testSaveRecord() throws Exception {
        //Создаем автомобиль для записи в БД
        Answer car1 = new Answer();
        car1.setText("Next?");
        car1.setQuestion(1);
 
        //Записали в БД
        Answer car = service.add(car1);
 
        //Вывели записанную в БД запись
        System.out.println(car);
    }
}

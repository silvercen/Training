package service;

import model.Trainee;
import repository.TraineeRepositoryImpl;
import service.TraineeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


public class TraineeServiceImplIntegrationTest {


    TraineeServiceImpl service;

    @BeforeEach
    public void setUp(){
        this.service = new TraineeServiceImpl();
    }


    @Test
    public void testSave(){
        // Given
        Trainee t1 =  new Trainee(1,"Karan","karan@yahoo.com");
        // Then
        Assertions.assertEquals(t1,service.save(t1));

    }

    @Test
    public void testFindByID()
    {
        int id = 1;

        Trainee t1 =  new Trainee(1,"Karan","karan@yahoo.com");
        service.save(t1);

        Assertions.assertNotNull(service.findById(id));
        Assertions.assertEquals(id,service.findById(id).getId());
    }

    @Test
    public void testDelete(){
        // Given
        int id = 1;
        // When
        service.delete(id);
        // Then
        Assertions.assertNull(service.findById(id));
    }


}
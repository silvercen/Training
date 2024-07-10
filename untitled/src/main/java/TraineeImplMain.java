import model.Trainee;
import java.util.*;
import org.w3c.dom.ls.LSOutput;
import repository.TraineeRepositoryImpl;
import service.*;

public class TraineeImplMain {
    public static void main(String[] args)
    {
        Trainee one = new Trainee(23, "abel", "abelk@gmail.com");
        Trainee two = new Trainee(24, "raj", "raj@gmail.com");
        Trainee three = new Trainee(25, "taj", "taj@gmail.com");
        Trainee four = new Trainee(26, "ram", "ram@gmail.com");

        TraineeServiceImpl serve = new TraineeServiceImpl();

        System.out.println("Saved : " + serve.save(one));
        System.out.println("Saved : " + serve.save(two));
        System.out.println("Saved : " + serve.save(three));
        System.out.println("Saved : " + serve.save(four));

        for(Trainee t: serve.findAll())
        {
            System.out.println(t);
        }

        System.out.println(serve.findById(25)+"\n"+"\n");
        serve.delete(25);

        for(Trainee t: serve.findAll())
        {
            System.out.println(t);
        }
    }

}

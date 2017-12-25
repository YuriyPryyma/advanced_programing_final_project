package Football;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "Dev");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        FootballService musicService = context.getBean(FootballService.class);
        System.out.println("beatles = " + musicService.eventsList());
    }
}

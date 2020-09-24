import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainApp {
    public static void main(String[] args) {
        County cork = new County("Cork");
        System.out.println(cork);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        County k = (County) context.getBean("kerry");
        System.out.println(k);

        Franchise jl = (Franchise) context.getBean("Justice league");
        System.out.println(jl);

        Franchise aw = (Franchise) context.getBean("Arrowverse");
        System.out.println(aw);

    }

}

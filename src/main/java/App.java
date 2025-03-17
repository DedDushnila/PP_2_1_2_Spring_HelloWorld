import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat one = (Cat) applicationContext.getBean("cat");
        one.setName("Biba");
        System.out.println(one.getName());

        Cat two = (Cat) applicationContext.getBean("cat");
        two.setName("Boba");
        System.out.println(two.getName());

        System.out.println("пары бинов для Cat равны: " + (one == two));
        System.out.println("пары бинов для HelloWorld равны: " + (bean == bean2));
    }
}
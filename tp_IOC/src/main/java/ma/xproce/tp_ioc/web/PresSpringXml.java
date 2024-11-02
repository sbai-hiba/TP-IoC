package ma.xproce.tp_ioc.web;

import ma.xproce.tp_ioc.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) applicationContext.getBean("metier");
        System.out.println(metier.calcul());
    }
}

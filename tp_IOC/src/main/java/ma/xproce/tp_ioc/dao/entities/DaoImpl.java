package ma.xproce.tp_ioc.dao.entities;

import ma.xproce.tp_ioc.dao.repositories.IDao;
import org.springframework.stereotype.Component;

@Component("data")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
// Se connecter à une base de données
        System.out.println("=> getData Version Base de données <=");
        double data = 23.0;
        return data;
    }


}

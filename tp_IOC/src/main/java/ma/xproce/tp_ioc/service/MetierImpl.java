package ma.xproce.tp_ioc.service;

import ma.xproce.tp_ioc.dao.entities.DaoImpl;
import ma.xproce.tp_ioc.dao.repositories.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
    public class MetierImpl implements IMetier{
    @Autowired
    @Qualifier("data")
        private IDao dao;
        @Override
        public double calcul() {
            double data=dao.getData();
            return 100.0*data;
        }
    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }
}

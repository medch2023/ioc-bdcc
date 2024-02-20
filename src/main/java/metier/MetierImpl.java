package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res= tmp * 10;
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }


}

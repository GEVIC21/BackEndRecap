package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao = null;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double nb = dao.getData();
        return nb*7 ;
    }
}

package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.edu.ups.entidad.Product;

@Stateless
public class ProductFacade extends AbstractFacade<Product> {

    @PersistenceContext(unitName = "Ejemplo.EJB.JSF.JPA")
    private EntityManager em;
    
    public ProductFacade() {
	super(Product.class);
    }    

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}

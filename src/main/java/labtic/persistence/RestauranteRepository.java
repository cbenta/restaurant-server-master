package labtic.persistence;

import labtic.business.entities.Restaurante;
import org.springframework.data.repository.CrudRepository;


public interface RestauranteRepository extends CrudRepository<Restaurante,String> {

    Restaurante findRestauranteByName(String name);

    

}

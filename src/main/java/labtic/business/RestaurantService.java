package labtic.business;

import labtic.business.entities.Restaurante;
import labtic.business.entities.SportCenters;
import labtic.business.exceptions.InvalidInformation;
import labtic.business.exceptions.RestaurantAlreadyExists;
import labtic.business.exceptions.SportCenterAlreadyExists;
import labtic.persistence.RestauranteRepository;
import labtic.persistence.SportCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> getAllRestaurants(){
        List<Restaurante> restaurantes = new ArrayList<>();
        Streamable.of(restauranteRepository.findAll()).forEach(restaurantes::add);
        return restaurantes;
    }

    public void guardarRestaurante(Restaurante restaurante) throws RestaurantAlreadyExists, InvalidInformation {
        if (restaurante.getName() == null || restaurante.getName().equals("")||
                restaurante.getTelefono() == null || restaurante.getTelefono().equals("")||
                restaurante.getDireccion() == null || restaurante.getDireccion().equals("")) {
            throw new InvalidInformation("Informacion Invalida");
        }
        if (restauranteRepository.findRestauranteByName(restaurante.getName()) != null){
            throw new RestaurantAlreadyExists("El restaurante ya existe");
        }

        restauranteRepository.save(restaurante);
    }
}

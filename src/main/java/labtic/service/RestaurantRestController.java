package labtic.service;

import labtic.business.RestaurantService;
import labtic.business.entities.Restaurante;
import labtic.business.exceptions.InvalidInformation;
import labtic.business.exceptions.RestaurantAlreadyExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/restaurante")
public class RestaurantRestController {

    @Autowired
    private RestaurantService restaurantService;

    public RestaurantRestController() {

    }

    @GetMapping(path= "/restaurante")
    public List<Restaurante> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping(path= "/restaurante")
    public void nuevoRestaurante(@RequestBody Restaurante restaurante) throws RestaurantAlreadyExists, InvalidInformation {
        restaurantService.guardarRestaurante(restaurante);
    }

}

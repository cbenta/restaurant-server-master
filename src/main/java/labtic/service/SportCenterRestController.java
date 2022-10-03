
package labtic.service;


import labtic.business.SportCenterService;
import labtic.business.entities.SportCenters;
import labtic.business.exceptions.InvalidInformation;
import labtic.business.exceptions.SportCenterAlreadyExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SportCenterRestController {

    @Autowired
    SportCenterService sportCentersService;

    public SportCenterRestController() {

    }

    @GetMapping(path = "/sport_centers")
    public List<SportCenters> getAllSportCenters () {
        return sportCentersService.getAllSportCenters();
    }

    @PostMapping(path = "/sport_centers")
    public void nuevoSportCenter(@RequestBody SportCenters sportCenter) throws SportCenterAlreadyExists, InvalidInformation {
        sportCentersService.guardarSportCenter(sportCenter);
    }
}
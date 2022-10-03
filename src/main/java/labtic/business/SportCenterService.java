package labtic.business;

import labtic.business.entities.Restaurante;
import labtic.business.entities.SportCenters;
import labtic.business.exceptions.InvalidInformation;
import labtic.business.exceptions.SportCenterAlreadyExists;
import labtic.persistence.SportCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SportCenterService {

    @Autowired
    private SportCenterRepository sportCenterRepository;

    public List<SportCenters> getAllSportCenters(){
        List<SportCenters> sportCenters = new ArrayList<>();
        Streamable.of(sportCenterRepository.findAll()).forEach(sportCenters::add);
        return sportCenters;
    }

    public void guardarSportCenter(SportCenters sportCenter) throws InvalidInformation, SportCenterAlreadyExists {
        if (sportCenter.getCommercialName() == null || sportCenter.getCommercialName().equals("")
                || sportCenter.getBusinessName() == null || sportCenter.getBusinessName().equals("")
                || sportCenter.getStartTime() == null || sportCenter.getStartTime().equals("")
                || sportCenter.getCloseTime() == null || sportCenter.getCloseTime().equals("")) {
            throw new InvalidInformation("Información inválida");
        }
        if (sportCenterRepository.findSportCenterByBusinessName(sportCenter.getBusinessName()) != null) {
            throw new SportCenterAlreadyExists("El centro de deportes ya existe.");
        }

        sportCenterRepository.save(sportCenter);
    }
}

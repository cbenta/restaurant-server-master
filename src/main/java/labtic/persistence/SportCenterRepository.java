package labtic.persistence;

import labtic.business.entities.SportCenters;
import org.springframework.data.repository.CrudRepository;


public interface SportCenterRepository extends CrudRepository<SportCenters,Integer> {

    SportCenters findSportCenterById(Integer sportCenterId);
    SportCenters findSportCenterByBusinessName(String businessName);
}

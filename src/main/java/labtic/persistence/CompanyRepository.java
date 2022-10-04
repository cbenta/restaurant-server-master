package labtic.persistence;

import labtic.business.entities.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,Integer> {

    Company findCompanyById(Integer companyId);
    Company findCompanyByBusinessName(String companyBusinessName);
}

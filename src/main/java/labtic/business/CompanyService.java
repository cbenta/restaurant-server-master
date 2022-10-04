package labtic.business;

import labtic.business.entities.Company;
import labtic.business.exceptions.CompanyAlreadyExists;
import labtic.business.exceptions.InvalidInformation;
import labtic.persistence.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        Streamable.of(companyRepository.findAll()).forEach(companies::add);
        return companies;
    }

    public void guardarCompany(Company company) throws InvalidInformation, CompanyAlreadyExists {
        if (company.getCommercialName() == null || company.getCommercialName().equals("")
            || company.getBusinessName() == null || company.getBusinessName().equals("")
            || company.getAdress() == null || company.getAdress().equals("")
            || company.getPhone() == null || company.getPhone().equals("")
            || company.getSubsidy() == null || company.getSubsidy().equals("")
            || company.getMaxSpending() == null || company.getMaxSpending().equals("")) {
            throw new InvalidInformation("Información inválida");
        }
        if (companyRepository.findCompanyByBusinessName(company.getBusinessName()) != null) {
            throw new CompanyAlreadyExists("La compañía ya existe.");
        }

        companyRepository.save(company);
    }
}

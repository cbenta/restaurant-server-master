package labtic.service;

import labtic.business.CompanyService;
import labtic.business.entities.Company;
import labtic.business.exceptions.CompanyAlreadyExists;
import labtic.business.exceptions.InvalidInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyRestController {

    @Autowired
    CompanyService companyService;

    public CompanyRestController() {

    }

    @GetMapping(path = "/company")
    public List<Company> getAllCompanies () {
        return companyService.getAllCompanies();
    }

    @PostMapping
    public void nuevaCompany(@RequestBody Company company) throws InvalidInformation, CompanyAlreadyExists {
        companyService.guardarCompany(company);
    }
}

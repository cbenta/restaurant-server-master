package labtic.business.exceptions;

public class CompanyAlreadyExists extends Exception{
    public CompanyAlreadyExists(String message) {
        super(message);
    }

    public CompanyAlreadyExists() {
    }
}

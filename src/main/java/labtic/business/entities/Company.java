package labtic.business.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Company {
    @Id
    private Long id; // No se usa
    private String commercialName;
    private String businessName;
    private String address;
    private String phone;
    private String subsidy;
    private Integer maxSpending;
    private Integer userInsert;
    private LocalDate insertDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company(String commercialName, String businessName, String address, String phone, String subsidy, Integer maxSpending, Integer userInsert, LocalDate insertDate) {
        this.commercialName = commercialName;
        this.businessName = businessName;
        this.address = address;
        this.phone = phone;
        this.subsidy = subsidy;
        this.maxSpending = maxSpending;
        this.userInsert = userInsert;
        this.insertDate = insertDate;
    }

    public Company(){
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(String subsidy) {
        this.subsidy = subsidy;
    }

    public Integer getMaxSpending() {
        return maxSpending;
    }

    public void setMaxSpending(Integer maxSpending) {
        this.maxSpending = maxSpending;
    }

    public Integer getUserInsert() {
        return userInsert;
    }

    public void setUserInsert(Integer userInsert) {
        ; // Este campo no es editable.
    }

    public LocalDate getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDate insertDate) {
        ; // Este campo no es editable.
    }

    @Override
    public String toString() {
        return "Company{" +
                "commercialName='" + commercialName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", adress='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", subsidy='" + subsidy + '\'' +
                ", maxSpending=" + maxSpending +
                ", userInsert=" + userInsert +
                ", insertDate=" + insertDate +
                '}';
    }
}

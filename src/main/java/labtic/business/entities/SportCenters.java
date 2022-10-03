package labtic.business.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class SportCenters {

    private String commercialName;
    private String businessName;
    private LocalTime startTime;
    private LocalTime closeTime;
    private Integer userInsert;
    private LocalDate insertDate;
    private Long id; // No se usa, pero me obliga a crearlo.

    public SportCenters (String commercialName, String businessName, LocalTime startTime, LocalTime closeTime, Integer userInsert, LocalDate insertDate) {
        this.commercialName = commercialName;
        this.businessName = businessName;
        this.startTime = startTime;
        this.closeTime = closeTime;
        this.userInsert = userInsert;
        this.insertDate = insertDate;
    }

    public SportCenters () {

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

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
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
        return "SportCenter{" +
                "commercialName='" + commercialName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", startTime=" + startTime +
                ", closeTime=" + closeTime +
                ", userInsert=" + userInsert +
                ", insertDate=" + insertDate +
                '}';
    }

    // Estos no se usan, pero me obliga a crear un id.
    @Id
    public Long getId() { return id; }
    public void setId(Long id) { ; }
}

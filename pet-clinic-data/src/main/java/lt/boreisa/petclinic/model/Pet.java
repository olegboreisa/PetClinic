package lt.boreisa.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

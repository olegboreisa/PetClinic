package lt.boreisa.petclinic.bootstrap;

import lt.boreisa.petclinic.model.Owner;
import lt.boreisa.petclinic.model.Vet;
import lt.boreisa.petclinic.services.OwnerService;
import lt.boreisa.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner ();
        owner1.setId(1L);
        owner1.setFirstName("Johnny");
        owner1.setLastName("Bravo");

        ownerService.save(owner1);

        Owner owner2 = new Owner ();
        owner2.setId(2L);
        owner2.setFirstName("Adam");
        owner2.setLastName("Sandler");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet ();
        vet1.setId(1L);
        vet1.setFirstName("Tom");
        vet1.setLastName("Cruise");

        vetService.save(vet1);

        Vet vet2 = new Vet ();
        vet2.setId(2L);
        vet2.setFirstName("Spike");
        vet2.setLastName("Lee");

        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }
}

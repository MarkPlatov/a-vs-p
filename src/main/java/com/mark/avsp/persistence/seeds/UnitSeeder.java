package com.mark.avsp.persistence.seeds;

import com.mark.avsp.persistence.factoryes.UnitFactory;
import com.mark.avsp.persistence.models.Unit;
import com.mark.avsp.persistence.repositories.UnitRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UnitSeeder implements CommandLineRunner {

    private final UnitRepo unitRepo;
    public UnitSeeder(UnitRepo unitRepo) {
        this.unitRepo = unitRepo;
    }

    @Override
    public void run(String... args) {
        baseHumanUnit();
    }

    public void baseHumanUnit() {
        if (unitRepo.count() != 0) {
            unitRepo.deleteAll();
        }

        Unit unit = new UnitFactory()
                .basePower(3)
                .baseSpeed(1)
                .armor("Combat shirt")
                .weapon("Fist")
                .race("Human")
                .build();
        unitRepo.save(unit);
    }
}
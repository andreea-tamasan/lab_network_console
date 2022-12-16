package Domain.Validator;

import Domain.Prietenie;

public class ValidatorPrietenie implements Validator<Prietenie>{


    @Override
    public void validate_add(Prietenie entity) {
        if(entity.getId_prietenie_trimisa() <= 0)
            throw new ValidationException("id-ul nu poate fi negativ");
        if(entity.getId_prietenie_primita() <= 0)
            throw new ValidationException("id-ul nu poate fi negativ");
        if(entity.getId() <= 0)
            throw new ValidationException("id-ul nu poate fi negativ");
        if(entity.getId_prietenie_trimisa() == entity.getId_prietenie_primita())
            throw new ValidationException("id-urile utilizatorilor trebuie sa fie diferite. ");
    }

    @Override
    public void validate_delete(Prietenie entity) {
        if(entity.getId() <= 0)
            throw new ValidationException("id-ul nu poate fi negativ");
    }
}

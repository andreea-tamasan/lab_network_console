package Service;

import Domain.Prietenie;
import Domain.Utilizator;
import Domain.Validator.ValidationException;
import Domain.Validator.Validator;
import Repo.RepoModelmplementat;

import java.util.List;

public class ServicePrietenie extends Service<Prietenie>{
    RepoModelmplementat<Utilizator> utilizatorRepoModelmplementat;
    RepoModelmplementat<Prietenie> prietenieRepoModelmplementat;

    Validator<Prietenie> prietenieValidator;

    public ServicePrietenie() {}


    public ServicePrietenie(RepoModelmplementat<Utilizator> utilizatorRepoModelmplementat, RepoModelmplementat<Prietenie> prietenieRepoModelmplementat,Validator<Prietenie> prietenieValidator) {
        this.utilizatorRepoModelmplementat = utilizatorRepoModelmplementat;
        this.prietenieRepoModelmplementat = prietenieRepoModelmplementat;
        this.prietenieValidator = prietenieValidator;
    }


    public List<Prietenie> get_all(){
        return prietenieRepoModelmplementat.get_all();
    }

    public Prietenie get_by_id(int id){
        for(Prietenie p: prietenieRepoModelmplementat.get_all()){
            if(p.getId() == id)
                return p;
        }
    return null;
    }

    public void add(Prietenie prietenie){
        int k1=0;
        int k2=0;
        int ok =1;
        for(Prietenie p: prietenieRepoModelmplementat.get_all()){
            if(p.getId() == prietenie.getId())
                throw new ValidationException("Exista deja prietenie cu id-ul dat.");
        }
        for(Utilizator u: utilizatorRepoModelmplementat.get_all()){
            if(prietenie.getId_prietenie_primita() == u.getId()){
                    k1=1;
        }}
        for(Utilizator u: utilizatorRepoModelmplementat.get_all()){
            if(prietenie.getId_prietenie_trimisa() == u.getId()){
                k2=1;
            }
        }
        for(Prietenie prietenie1: prietenieRepoModelmplementat.get_all()) {
            if(prietenie1.getId_prietenie_trimisa() == prietenie.getId_prietenie_trimisa() && prietenie1.getId_prietenie_primita() == prietenie.getId_prietenie_primita())
                ok =0;
        }
        for(Prietenie prietenie1: prietenieRepoModelmplementat.get_all()) {
            if(prietenie1.getId_prietenie_primita() == prietenie.getId_prietenie_trimisa() && prietenie1.getId_prietenie_trimisa() == prietenie.getId_prietenie_primita())
                ok =0;
        }
        if(k2 == 1 && k1 ==1 && ok ==1){
            prietenieValidator.validate_add(prietenie);
            prietenieRepoModelmplementat.add(prietenie);
        }
        else
            throw new ValidationException("Id-ul utilizatorului dat nu exista sau exista deja prietenia intre cei doi.");
    }

    public void delete(int id){
        int k=0;
        for(Prietenie p: prietenieRepoModelmplementat.get_all()){
            if(p.getId() == id){
                k=1;
            }}
        if (k==0)
            throw new ValidationException("Id-ul prieteniei date nu exista.");
        else{
            prietenieValidator.validate_delete(get_by_id(id));
            prietenieRepoModelmplementat.delete(id);}
        }
}

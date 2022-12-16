package Service;

import Domain.Prietenie;
import Domain.Utilizator;
import Domain.Validator.Validator;
import Repo.RepoModelmplementat;
import Repo.RepoUttilizator;

import java.util.List;

public class ServiceUtilizator extends Service<Utilizator>{
    RepoModelmplementat<Prietenie> prietenieRepoModelmplementat;
    RepoModelmplementat<Utilizator> utilizatorRepoModelmplementat;
    Validator<Utilizator> utilizatorValidator;

    public ServiceUtilizator() {
    }

    public ServiceUtilizator(RepoModelmplementat<Utilizator> utilizatorRepoModelmplementat,RepoModelmplementat<Prietenie> prietenieRepoModelmplementat,Validator<Utilizator> utilizatorValidator) {
        this.utilizatorRepoModelmplementat = utilizatorRepoModelmplementat;
        this.prietenieRepoModelmplementat = prietenieRepoModelmplementat;
        this.utilizatorValidator = utilizatorValidator;
    }

    public Utilizator get_by_id(int id){
        for(Utilizator u: utilizatorRepoModelmplementat.get_all()){
            if(u.getId() == id)
                return u;
        }
        return null;
    }

    public List<Utilizator> get_all(){
        return utilizatorRepoModelmplementat.get_all();
    }

    public void add(Utilizator element){
        for(Utilizator u: utilizatorRepoModelmplementat.get_all()){
            if(u.getId() == element.getId())
                throw new IllegalArgumentException("Exista deja utilizator cu id-ul dat.");
        }
        utilizatorValidator.validate_add(element);
        utilizatorRepoModelmplementat.add(element);
    }

    public void delete(int id){
          int k=0;
          for(Utilizator u: utilizatorRepoModelmplementat.get_all()){
              if(u.getId() == id) {
                  k=1;
              }
          }
          if (k==0)
              throw new IllegalArgumentException("Id-ul dat nu este gasit.");
          else{
              utilizatorValidator.validate_delete(get_by_id(id));
              utilizatorRepoModelmplementat.delete(id);
              for(int i=0;  i< prietenieRepoModelmplementat.get_all().size();i++){
                  if(prietenieRepoModelmplementat.get_all().get(i).getId_prietenie_primita() == id || prietenieRepoModelmplementat.get_all().get(i).getId_prietenie_trimisa() ==id){
                      prietenieRepoModelmplementat.delete(prietenieRepoModelmplementat.get_all().get(i).getId());
                      i--;
                  }
              }

         }
    }

}


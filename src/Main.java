import Domain.Prietenie;
import Domain.Utilizator;
import Domain.Validator.ValidatorPrietenie;
import Domain.Validator.ValidatorUtilizator;
import Repo.RepoModelmplementat;
import Repo.RepoPrietenie;
import Repo.RepoUttilizator;
import Service.ServiceUtilizator;
import Service.ServicePrietenie;
import UserInterface.UI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //valori initiale
        Utilizator utilizator1 = new Utilizator(1,19,"Ana","Pop","ana.pop72@yahoo.com","07546738769");
        Utilizator utilizator2 = new Utilizator(2,22,"Maria","Ilena","maria.ilena@yahoo.com","0754093876");
        Utilizator utilizator3 = new Utilizator(3,45,"Tudor","Magura","magura.tuddor34@gmail.com","0754567876");
        Utilizator utilizator4 = new Utilizator(4,32,"Alex","Pop","alexutzu.pop2002@yahoo.com","07546730998");
        Prietenie prietenie1= new Prietenie(1,1,2,"Buna");
        Prietenie prietenie2= new Prietenie(2,1,3,"Ce faci");
        Prietenie prietenie3= new Prietenie(3,3,4,"Hei!");
        //------------------------

        RepoUttilizator repoUttilizator = new RepoUttilizator();
        ValidatorUtilizator validatorUtilizator = new ValidatorUtilizator();
        RepoPrietenie repoPrietenie = new RepoPrietenie();
        ValidatorPrietenie validatorPrietenie = new ValidatorPrietenie();
        ServiceUtilizator serviceUtilizator = new ServiceUtilizator(repoUttilizator,repoPrietenie,validatorUtilizator);
        ServicePrietenie servicePrietenie = new ServicePrietenie(repoUttilizator, repoPrietenie,validatorPrietenie);
        UI ui = new UI(serviceUtilizator, servicePrietenie);

        //adaugari valori initiale in program
        repoUttilizator.add(utilizator1);
        repoUttilizator.add(utilizator2);
        repoUttilizator.add(utilizator3);
        repoUttilizator.add(utilizator4);
        repoPrietenie.add(prietenie1);
        repoPrietenie.add(prietenie2);
        repoPrietenie.add(prietenie3);
        //--------------------

        ui.run_menu();
    }
}
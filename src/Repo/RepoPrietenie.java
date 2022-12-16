package Repo;

import Domain.Prietenie;
import Domain.Utilizator;

import java.util.ArrayList;
import java.util.List;

public class RepoPrietenie extends RepoModelmplementat<Prietenie>{


    public RepoPrietenie() {
        this.list=new ArrayList<>();
    }

    Prietenie get_by_id(int id){
        for(Prietenie p: list)
            if(id == p.getId())
                return p;
        return null;
    }
    public void delete(int id) {
        list.remove(this.get_by_id(id));
    }
}

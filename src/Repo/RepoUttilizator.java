package Repo;

import Domain.Utilizator;

import java.util.ArrayList;
import java.util.List;

public class RepoUttilizator extends RepoModelmplementat<Utilizator>{

    public RepoUttilizator() {
        this.list=new ArrayList<>();
    }
    Utilizator get_by_id(int id){
        for(Utilizator u: list)
            if(id == u.getId())
                return u;
        return null;
    }
    public void delete(int id) {
        list.remove(this.get_by_id(id));
    }
}

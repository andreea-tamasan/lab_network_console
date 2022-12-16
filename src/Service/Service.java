package Service;

import Repo.RepoModelmplementat;

import java.util.List;

public abstract class Service<T> {
    /**
     * afiseaza lista
     * @return - toata lista de tipul T
     */
    public abstract List<T> get_all();

    /**
     * cauta un element in lista dupa id
     * @param id(int) - id-ul elementului de cautat
     * @return - elementul cu id-ul dat
     */
    public abstract T get_by_id(int id);

    /**
     * adauga elementul in lista
     * @param element - elementul de adaugat
     */
    public abstract void add(T element);

    /**
     * sterge un element in functie de id
     * @param id - id-ul elementului de sters
     */
    public abstract void delete(int id);
}

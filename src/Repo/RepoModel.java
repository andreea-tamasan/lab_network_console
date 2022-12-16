package Repo;

import java.util.List;

public interface RepoModel<T> {
    /**
     * adaugare element in lista
     * @param element - element T de adaugat
     */
    void add(T element);

    /**
     * stergere element din lista dupa id
     * @param id - id-ul elementului T de sters
     */
    void delete(int id);

    /**
     * returneaza toata lista
      * @return - toata lista cu elemenmte de tipul T
     */
    List<T> get_all();
}

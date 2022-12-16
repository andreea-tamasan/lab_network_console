package Repo;
import java.util.List;

public abstract class RepoModelmplementat<T> implements RepoModel<T>{
    public List<T> list;
    /**
     * adaugare element in lista
     * @param element - element T de adaugat
     */
    @Override
    public void add(T element) {
        list.add(element);
    }
    /**
     * stergere element din lista dupa id
     * @param id - id-ul elementului T de sters
     */
    @Override
    public abstract void delete(int id);

    /**
     * returneaza toata lista
     * @return - toata lista cu elemenmte de tipul T
     */
    @Override
    public List<T> get_all() {
        return list;
    }
}

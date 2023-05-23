package data;

import model.Cargo;

import java.util.List;

public interface CargoDAO extends DAO<Cargo>{
    void salvar(Cargo cargo);
    void atualizar(Cargo cargo);
    void apagar(Cargo cargo);
    Cargo buscar(int id);
    List<Cargo> buscarTodos();
}

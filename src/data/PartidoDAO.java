package data;

import model.Partido;

import java.util.List;

public interface PartidoDAO extends DAO<Partido> {
    void salvar(Partido partido);
    void atualizar(Partido partido);
    void apagar(Partido partido);
    Partido buscar(int id);
    List<Partido> buscarTodos();
}

package data;

import model.Candidato;

import java.util.List;

public interface CandidatoDAO extends DAO<Candidato>{
    void salvar(Candidato candidato);
    void atualizar(Candidato candidato);
    void apagar(Candidato candidato);
    Candidato buscar(int id);
    List<Candidato> buscarTodos();
}

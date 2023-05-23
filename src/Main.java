import data.*;
import model.Candidato;
import model.Cargo;
import model.Partido;


public class Main {
    public static void main(String[] args) {
        Partido partido1 = new Partido(4, "Hollywood", "HL");
        Partido partido2 = new Partido(8, "Manhattan", "MH");

        PartidoDAO partidoDAO = new PartidoSQliteDAO();
        partidoDAO.salvar(partido1);
        partidoDAO.salvar(partido2);

        Cargo cargo1 = new Cargo(40, "Presidente");
        Cargo cargo2 = new Cargo(80, "Governador");

        CargoDAO cargoDAO = new CargoSQliteDAO();
        cargoDAO.salvar(cargo1);
        cargoDAO.salvar(cargo2);

        Candidato candidato1 = new Candidato(4040, "Sophia", cargo1, partido1);
        Candidato candidato2 = new Candidato(8080, "Jesse", cargo2, partido2);

        CandidatoDAO candidatoDAO = new CandidatoSQliteDAO();
        candidatoDAO.salvar(candidato1);
        candidatoDAO.salvar(candidato2);

        System.out.println("\nPartidos:");
        for (Partido p : partidoDAO.buscarTodos())
            p.mostrarDados();


        System.out.println("\nCargos:");
        for (Cargo c :cargoDAO.buscarTodos())
             c.mostrarDados();

        System.out.println("\nCandidatos:");
        for (Candidato c : candidatoDAO.buscarTodos())
             c.mostrarDados();

    }
}

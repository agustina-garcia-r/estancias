import persistencia.ClienteDAO;
import persistencia.FamiliaDAO;

public class Main {
    public static void main(String[] args) {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.imprimirTodosLosClientes();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FamiliaDAO familiaDAO = new FamiliaDAO();
            familiaDAO.imprimirTodasLasFamilias();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
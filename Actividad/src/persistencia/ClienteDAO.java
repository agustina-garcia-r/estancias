package persistencia;

import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;

public class ClienteDAO extends DAO {

    public ClienteDAO() {}

    public void guardarCliente(Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("El cliente no puede ser nulo");
        }
        String sql = "INSERT INTO clientes (nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES ('"

                + cliente.getNombre() + "', '"
                + cliente.getCalle() + "', '"
                + cliente.getNumero() + "', '"
                + cliente.getCodigoPostal() + "', '"
                + cliente.getCiudad() + "', '"
                + cliente.getPais() + "', '"
                + cliente.getEmail() + "')";
        insertarModificarEliminarDataBase(sql);
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        String sql = "SELECT id_cliente, nombre FROM clientes";
        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setNombre(resultSet.getString("nombre"));
            clientes.add(cliente);
        }
        return clientes;
    }

    public void imprimirTodosLosClientes() throws Exception {
        List<Cliente> clientes = listarTodosLosClientes();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar.");
        } else {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.getIdCliente() + ", Nombre: " + cliente.getNombre());
            }
        }
    }

    public void eliminarClientePorId(int id) throws Exception {
        String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
        insertarModificarEliminarDataBase(sql);
    }
}


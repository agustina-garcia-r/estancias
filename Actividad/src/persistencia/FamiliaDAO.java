package persistencia;
import java.util.ArrayList;
import java.util.List;
import entidades.Familia;
public class FamiliaDAO extends DAO {
    public void guardarFamilia(Familia familia) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("La familia no puede ser nula.");
            }
            String sql = "INSERT INTO familias (id_familia, nombre, edad_minima, eddd_maxima, num_hijos,email,id_casa_familia " + " VALUES (" +
                    familia.getId()+ ", '" +
                    familia.getNombre() + "', '" +
                    familia.getEdad_minima() + "', '" +
                    familia.getEdad_maxima() + "', '" +
                    familia.getNum_hijos() + "', '" +
                    familia.getEmail() + "', '" +
                    familia.getIdCasaFamilia() + "', '";
            insertarModificarEliminarDataBase(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public List<Familia> listarTodasLasFamilias() throws Exception {
        String sql = "SELECT id_familia, nombre FROM familias";
        consultarDataBase(sql);
        List<Familia> familias = new ArrayList<>();
        while (resultSet.next()) {
            Familia familia = new Familia();
            familia.setId(resultSet.getInt("id_familia"));
            familia.setNombre(resultSet.getString("nombre"));
            familias.add(familia);
        }
        return familias;
    }

    public void imprimirTodasLasFamilias() throws Exception {
        List<Familia> familias = listarTodasLasFamilias();
        if (familias.isEmpty()) {
            System.out.println("No hay familias para mostrar.");
        } else {
            System.out.println("Lista de familias:");
            for (Familia familia : familias) {
                System.out.println("ID: " + familia.getId() + ", Nombre: " + familia.getNombre());
            }
        }
    }

    public void eliminarFamiliaPorId(int id) throws Exception {
        String sql = "DELETE FROM familias WHERE id_familia = " + id;
        insertarModificarEliminarDataBase(sql);
    }
}
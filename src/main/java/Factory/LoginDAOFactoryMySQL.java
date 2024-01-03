package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.UsuarioDAO;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import modelo.Articulo;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LoginDAOFactoryMySQL implements UsuarioDAO {

    private SessionFactory conn=null;

    /**
     * Método para conectar con la BBDD
     * @param conn Conexión vía Hibernate.
     */
    public LoginDAOFactoryMySQL(SessionFactory conn){
        this.conn = conn;
    }



    @Override
    public String insertar(Usuario a) {

        SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(modelo.Usuario.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.save(a);
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();


        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void modificar(Usuario a) {

        SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(modelo.Usuario.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(a);
            session.getTransaction().commit();
            session.flush();
            session.close();

            sessionFactory.close();
            // -------------------------------------------------------------

        }catch (Exception e){

        }
    }

    @Override
    public void eliminar(String a) {

        SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(modelo.Usuario.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {

            session.beginTransaction();
            Usuario u = session.get(modelo.Usuario.class, a);

            session.delete(u);
            session.getTransaction().commit();
            session.close();

            sessionFactory.close();

            // -------------------------------------------------------------

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Usuario> obtenerTodos() {

        SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(modelo.Usuario.class)
                .buildSessionFactory();


        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            String filtro = "from Usuario";
            Query<Usuario> query = session.createQuery(filtro, modelo.Usuario.class);
            ArrayList<Usuario> usuarios = (ArrayList<Usuario>) query.list();
            session.close();

            sessionFactory.close();
            // -------------------------------------------------------------
            return usuarios;

        }catch (Exception e){

            e.printStackTrace();

        }
        return null;
    }

    @Override
    public Usuario obtenerUno(String id) {

        SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(modelo.Usuario.class).buildSessionFactory();

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Usuario u = session.get(modelo.Usuario.class,id);

            session.close();

            sessionFactory.close();
            // -------------------------------------------------------------
            return u;

        }catch (Exception e){

            e.printStackTrace();

        }
        return null;
    }

    @Override
    public ArrayList<Usuario> obtenerPorCriterio(String columna, String criterio) {

        SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(modelo.Usuario.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {
            ArrayList<Usuario> devolucion = new ArrayList<>();
            session.beginTransaction();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Usuario> criteriaQuery = builder.createQuery(modelo.Usuario.class);
            Root<Usuario> root = criteriaQuery.from(modelo.Usuario.class);

            // Agregar la cláusula WHERE

            criteriaQuery.where(builder.equal(root.get(columna), criterio));

            Query<Usuario> query = session.createQuery(criteriaQuery);
            devolucion = (ArrayList<Usuario>) query.getResultList();

            session.getTransaction().commit();

            return devolucion;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return null;
    }

}





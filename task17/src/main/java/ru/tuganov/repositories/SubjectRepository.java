package ru.tuganov.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.tuganov.SubjectCustomInterface;
import ru.tuganov.entities.Student;
import ru.tuganov.entities.Subject;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SubjectRepository implements SubjectCustomInterface {
    private final DataSource ds;

    @PersistenceContext
    private EntityManager entityManager;

    public SubjectRepository(DataSource ds) {
        this.ds = ds;
    }

    public List<Subject> getSubjects() throws SQLException {
        Connection connection = ds.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from subjects");
        ResultSet rs = ps.executeQuery();
        List<Subject> subjects = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt(2);
            String name = rs.getString(3);
            String description = rs.getString(4);
            int student_id = rs.getInt(1);
            subjects.add(new Subject(id, name, description, student_id));
        }
        return subjects;
    }

    public Subject addSubject(Subject subject) throws SQLException {
        Connection connection = ds.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into subjects (id, name, description, student_id) values (?, ?, ?, ?)", new String[] {"id"});
        ps.setInt(1, subject.getId());
        ps.setString(2, subject.getName());
        ps.setString(3, subject.getDescription());
        ps.setInt(4, subject.getStudent_id());
        ps.executeUpdate();
        return subject;
    }

    public boolean deleteSubject(int id) throws SQLException {
        Connection connection = ds.getConnection();
        PreparedStatement ps = connection.prepareStatement("delete from subjects where id = ?");
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    }

    @Override
    public List<Subject> getSpecificSubject(String name) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Subject> criteriaQuery = criteriaBuilder.createQuery(Subject.class);
        Root<Subject> root = criteriaQuery.from(Subject.class);
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("name"), name));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}

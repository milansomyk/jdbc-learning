package milansomyk.jdbclearning.service;

import jakarta.annotation.PostConstruct;
import milansomyk.jdbclearning.User;
import milansomyk.jdbclearning.repository.UserCustomJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JdbcService {
    private final UserCustomJdbcRepository userCustomJdbcRepository;
    public JdbcService(UserCustomJdbcRepository userCustomJdbcRepository) {
        this.userCustomJdbcRepository = userCustomJdbcRepository;
    }

    @PostConstruct
    @Transactional
    public void getAll() {
        User allUsers = userCustomJdbcRepository.getAllUsers();
        System.out.println(allUsers);
//        jdbcTemplate.execute("CREATE TABLE USERS (id integer PRIMARY KEY , name VARCHAR(60), surname VARCHAR(60), email VARCHAR(120))");
//        System.out.println("table is created!");
//        String PUT_QUERY = "INSERT INTO USERS VALUES (?,?,?,?)";
//        jdbcTemplate.update(PUT_QUERY, 2, "Gon", "Sanchez", "gonsanchez@gmail.com");
//        jdbcTemplate.update(PUT_QUERY, 1, "Bill", "Gates", "billgates@gmail.com");
    }
}

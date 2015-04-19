package hello.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Iterable<User> findByFirstname(String firstname);

    @Query("select u from User u where u.firstname like %?1")
    Iterable<User> findByFirstnameEndsWith(String firstname);
}

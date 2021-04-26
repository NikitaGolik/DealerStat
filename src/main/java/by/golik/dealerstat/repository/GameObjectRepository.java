package by.golik.dealerstat.repository;

import by.golik.dealerstat.entity.GameObject;
import by.golik.dealerstat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Nikita Golik
 */
@Repository
public interface GameObjectRepository extends JpaRepository<GameObject, Long> {

    Optional<GameObject> findByIdAndApprovedTrue(long id);
    List<GameObject> findAllByAuthor(User author);

}

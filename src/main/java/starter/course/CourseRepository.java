package starter.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Anirudha on 10-07-2017.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

    Collection<Course> findByTopicId(Integer id);
}

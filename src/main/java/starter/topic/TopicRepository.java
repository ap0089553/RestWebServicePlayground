package starter.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Anirudha on 10-07-2017.
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer>{
}

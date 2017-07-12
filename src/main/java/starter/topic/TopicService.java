package starter.topic;

import java.util.Collection;

/**
 * Created by Anirudha on 10-07-2017.
 */
public interface TopicService {
    Collection<Topic> getAllTopics();

    Topic getTopic(Integer id);

    void addTopic(Topic topic);

    void updateTopic(Topic topic);

    void deleteTopic(Integer id);
}

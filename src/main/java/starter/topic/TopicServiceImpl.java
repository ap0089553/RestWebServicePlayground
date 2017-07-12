package starter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Anirudha on 10-07-2017.
 */
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Override
    public Collection<Topic> getAllTopics() {
        Collection<Topic> allTopics = new ConcurrentLinkedQueue<>();
        topicRepository.findAll().iterator().forEachRemaining(topic -> allTopics.add(topic));
        return allTopics;
    }

    @Override
    public Topic getTopic(Integer id) {
        return topicRepository.findOne(id);
    }

    @Override
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public void updateTopic(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public void deleteTopic(Integer id) {
        topicRepository.delete(id);
    }
}

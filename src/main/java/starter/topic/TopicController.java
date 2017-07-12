package starter.topic;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Anirudha on 10-07-2017.
 */
@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @ApiOperation("Get All Topics")
    @GetMapping("/")
    public Collection<Topic> getAllTopics() {
        Collection<Topic> allTopics = topicService.getAllTopics();
        return allTopics;
    }

    @ApiOperation("Get Course for Id")
    @GetMapping("/{id}")
    public Topic getTopic(@ApiParam("Id of the Course") @PathVariable("id") Integer id) {
        return topicService.getTopic(id);
    }

    @ApiOperation("Add Course to Course Repo")
    @PostMapping("/")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @ApiOperation("Update Course")
    @PutMapping("/")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @ApiOperation("Delete Course")
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Integer id) {
        topicService.deleteTopic(id);
    }
}


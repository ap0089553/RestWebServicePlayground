package starter.course;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import starter.topic.Topic;

import java.util.Collection;

/**
 * Created by Anirudha on 10-07-2017.
 */
@RestController
@RequestMapping("/topics/{topicId}/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @ApiOperation("Get All Course")
    @GetMapping("/")
    public Collection<Course> getAllCourses(@ApiParam("Topic id course is part of") @PathVariable("topicId") Integer topicId) {
        Collection<Course> allCourses = courseService.getAllCourses(topicId);
        return allCourses;
    }

    @ApiOperation("Get Course for Id")
    @GetMapping("/{courseId}")
    public Course getCourse(@ApiParam("id of the Course") @PathVariable("courseId") Integer courseId) {
        return courseService.getCourse(courseId);
    }

    @ApiOperation("Add Course to Course Repo")
    @PostMapping("/")
    public void addCourse(@ApiParam("Topic id to add course to") @PathVariable("topicId") Integer topicId
            , @RequestBody Course course) {
        course.setTopic(Topic.builder().id(topicId).build());
        courseService.addCourse(course);
    }

    @ApiOperation("Update Course")
    @PutMapping("/{courseId}")
    public void updateCourse(@ApiParam("Course id of Course to be updated") @PathVariable("courseId") Integer courseId
            , @RequestBody Course course) {
        courseService.updateCourse(course);
    }

    @ApiOperation("Delete Course")
    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId) {
        courseService.deleteCourse(courseId);
    }
}


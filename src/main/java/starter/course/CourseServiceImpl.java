package starter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Anirudha on 10-07-2017.
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Collection<Course> getAllCourses(Integer topicId) {
        Collection<Course> allCourses= new ConcurrentLinkedQueue<>();
        courseRepository.findAll().forEach((course) -> System.out.println());
        courseRepository.findByTopicId(topicId).iterator().forEachRemaining(course -> allCourses.add(course));
        return allCourses;
    }

    @Override
    public Course getCourse(Integer id) {
        return courseRepository.findOne(id);
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepository.delete(id);
    }
}

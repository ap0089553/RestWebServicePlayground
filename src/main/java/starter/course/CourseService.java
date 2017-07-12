package starter.course;

import java.util.Collection;

/**
 * Created by Anirudha on 10-07-2017.
 */
public interface CourseService {
    Collection<Course> getAllCourses(Integer topicId);

    Course getCourse(Integer id);

    void addCourse(Course course);

    void updateCourse(Course course);

    void deleteCourse(Integer id);
}

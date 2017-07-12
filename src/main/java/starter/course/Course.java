package starter.course;

import lombok.*;
import starter.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Anirudha on 10-07-2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Course implements Comparable<Course>{
    @NonNull
    @Id
    private Integer id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Course course = (Course) o;

        if (!id.equals(course.id)) return false;
        return name.equals(course.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public int compareTo(Course o) {
        return this.id.compareTo(o.getId());
    }
}

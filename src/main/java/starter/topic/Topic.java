package starter.topic;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Anirudha on 10-07-2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Topic implements Comparable<Topic>{
    @NonNull
    @Id
    private Integer id;
    private String name;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Topic topic = (Topic) o;

        if (!id.equals(topic.id)) return false;
        return name != null ? name.equals(topic.name) : topic.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Topic o) {
        return this.id.compareTo(o.getId());
    }
}
